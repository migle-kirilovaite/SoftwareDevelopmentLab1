package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.ElectiveCourse;
import com.example.lab1swdev.entities.Student;
import com.example.lab1swdev.persistence.ElectiveCourseDAO;
import com.example.lab1swdev.persistence.StudentsDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Model
@ViewScoped
public class ElectiveCourseEdit implements Serializable {

    @Inject
    private ElectiveCourseDAO electiveCourseDAO;

    @Inject
    private StudentsDAO studentsDao;

    @Getter @Setter
    private Integer studentToAddId;

    @Getter @Setter
    private List<Student> allStudents;

    @Getter @Setter
    private ElectiveCourse selectedCourse;

    @PostConstruct
    public void init() {
        this.allStudents = studentsDao.loadAll();
        loadSelectedCourse();
    }

    @Transactional
    public void loadSelectedCourse() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String courseId = params.get("courseId");
        if (courseId != null) {
            this.selectedCourse = electiveCourseDAO.findOne(Integer.valueOf(courseId));
        }
    }

    @Transactional
    public void addStudentToCourse() {
        if (studentToAddId == null || selectedCourse == null) {
            return;
        }

        ElectiveCourse course = electiveCourseDAO.findOne(selectedCourse.getId());
        Student student = studentsDao.findOne(studentToAddId);

        course.getStudents().add(student);
        student.getElectiveCourses().add(course);

        electiveCourseDAO.merge(course);
    }

    @Transactional
    public void removeStudentFromCourse(Integer studentId) {
        if (studentId == null || selectedCourse == null) {
            return;
        }

        ElectiveCourse course = electiveCourseDAO.findOne(selectedCourse.getId());
        Student student = studentsDao.findOne(studentId);

        if (course.getStudents().contains(student)) {
            course.getStudents().remove(student);
            student.getElectiveCourses().remove(course);
        }

        electiveCourseDAO.merge(course);
    }


}
