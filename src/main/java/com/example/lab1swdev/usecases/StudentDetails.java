package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.ElectiveCourse;
import com.example.lab1swdev.entities.Student;
import com.example.lab1swdev.entities.StudyGroup;
import com.example.lab1swdev.persistence.ElectiveCourseDAO;
import com.example.lab1swdev.persistence.StudentsDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Model
@ViewScoped
public class StudentDetails implements Serializable {
    @Inject
    private StudentsDAO studentsDao;

    @Inject
    private ElectiveCourseDAO electiveCourseDao;

    @Getter @Setter
    private Student student;

    @Getter @Setter
    private List<ElectiveCourse> electiveCourses;

    @Getter @Setter
    private StudyGroup studyGroup;

    @Getter @Setter
    private List<ElectiveCourse> allCourses;

    @Getter @Setter
    private Integer courseToAddId;

    @PostConstruct
    public void init(){
        this.allCourses = electiveCourseDao.loadAll();
        this.loadSelectedStudent();
    }

    @Transactional
    public void loadSelectedStudent() {
        Map<String, String> params =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String studentId = params.get("studentId");
        if(studentId != null) {
            this.student = studentsDao.findOne(Integer.parseInt(studentId));
            this.electiveCourses = student.getElectiveCourses();
            this.studyGroup = student.getGroup();
        }
    }

    @Transactional
    public void addCourseToStudent() {
        System.out.println("Student: " + student.getId());
        if (courseToAddId == null || student == null) {
            return;
        }

        ElectiveCourse courseToAdd = electiveCourseDao.findOne(courseToAddId);

        student.getElectiveCourses().add(courseToAdd);
        courseToAdd.getStudents().add(student);

        studentsDao.merge(student);}
}