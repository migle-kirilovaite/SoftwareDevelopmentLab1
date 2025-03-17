package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.ElectiveCourse;
import com.example.lab1swdev.persistence.ElectiveCourseDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

@Model
public class ElectiveCourseList implements Serializable {

    @Inject
    private ElectiveCourseDAO electiveCourseDAO;

    @Getter @Setter
    private ElectiveCourse electiveCourseToCreate = new ElectiveCourse();

    @Getter @Setter
    private List<ElectiveCourse> allElectiveCourses;

    @PostConstruct
    public void init() {
        this.allElectiveCourses = electiveCourseDAO.loadAll();
    }

    // Create a new course
    @Transactional
    public void createCourse() {
        electiveCourseDAO.persist(electiveCourseToCreate);
        allElectiveCourses.add(electiveCourseToCreate);  // Add to the list to refresh the UI
        electiveCourseToCreate = new ElectiveCourse();   // Reset form
    }
}
