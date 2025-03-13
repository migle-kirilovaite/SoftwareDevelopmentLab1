package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.ElectiveCourse;
import com.example.lab1swdev.entities.Student;
import com.example.lab1swdev.persistence.ElectiveCourseDAO;
import com.example.lab1swdev.persistence.StudentsDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Model;
import javax.faces.context.SessionMap;
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

    // Load the selected course based on the courseId
    @Transactional
    public void loadSelectedCourse() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String courseId = params.get("courseId");  // Get the courseId parameter
        System.out.println("Course ID: " + courseId);
        if (courseId != null) {
            this.selectedCourse = electiveCourseDAO.findOne(Integer.valueOf(courseId)); // Retrieve the full course details
        }
    }

    // Add a student to the selected course
    @Transactional
    public void addStudentToCourse() {
        System.out.println("Course ID: " + selectedCourse.getId());
        // Retrieve the selected course
        ElectiveCourse course = electiveCourseDAO.findOne(selectedCourse.getId());
        // Retrieve the student to add
        Student student = studentsDao.findOne(studentToAddId);
        // Add the student to the course's student list
        course.getStudents().add(student);
        // Add the course to the student's elective courses list
        student.getElectiveCourses().add(course);
        // Merge the updated course and student entities
        electiveCourseDAO.merge(course);
        studentsDao.merge(student);
    }

}
