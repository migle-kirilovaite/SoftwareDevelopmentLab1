package com.example.lab1swdev.persistence;

import com.example.lab1swdev.entities.StudyGroup;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class StudyGroupDAO {
    @Inject
    private EntityManager entityManager;

    public List<StudyGroup> loadAll() {
        return entityManager.createNamedQuery("StudyGroup.findAll", StudyGroup.class).getResultList();
    }

    public void persist(StudyGroup studyGroupToCreate) {
        this.entityManager.persist(studyGroupToCreate);
    }

    public StudyGroup findOne(Integer id) {
        return entityManager.find(StudyGroup.class, id);
    }
}
