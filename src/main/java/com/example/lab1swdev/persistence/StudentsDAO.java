package com.example.lab1swdev.persistence;

import com.example.lab1swdev.entities.Student;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class StudentsDAO {
    @Inject
    private EntityManager entityManager;

    public void persist(Student student) {
        this.entityManager.persist(student);
    }

    public List<Student> loadAll() {
        return entityManager.createNamedQuery("Student.findAll", Student.class).getResultList();
    }

    public Student findOne(Integer id) {
        return entityManager.find(Student.class, id);
    }

    public void merge(Student student) {
        entityManager.merge(student);
    }
}
