package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.ElectiveCourse;
import com.example.lab1swdev.entities.Student;
import com.example.lab1swdev.entities.StudyGroup;
import com.example.lab1swdev.persistence.StudentsDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.List;
import java.util.Map;

@Model
public class StudentDetails {
    @Inject
    private StudentsDAO studentsDao;

    @Getter @Setter
    private Student student;

    @Getter @Setter
    private List<ElectiveCourse> electiveCourses;

    @Getter @Setter
    private StudyGroup studyGroup;

    @PostConstruct
    public void init(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer studentId = Integer.parseInt(requestParameters.get("studentId"));
        this.student = studentsDao.findOne(studentId);
        this.electiveCourses = student.getElectiveCourses();
        this.studyGroup = student.getGroup();
    }
}