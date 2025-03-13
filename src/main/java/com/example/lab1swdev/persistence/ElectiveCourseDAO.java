package com.example.lab1swdev.persistence;

import com.example.lab1swdev.entities.ElectiveCourse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class ElectiveCourseDAO {
    @Inject
    private EntityManager entityManager;

    public void persist(ElectiveCourse electiveCourse) {
        this.entityManager.persist(electiveCourse);
    }

    public List<ElectiveCourse> loadAll() {
        return entityManager.createNamedQuery("ElectiveCourse.findAll", ElectiveCourse.class).getResultList();
    }

    public ElectiveCourse findOne(Integer courseId) {
        return entityManager.find(ElectiveCourse.class, courseId);
    }

    public void merge(ElectiveCourse course) {
        entityManager.merge(course);
    }
}
