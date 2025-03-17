package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.StudyGroup;
import com.example.lab1swdev.persistence.StudyGroupDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class StudyGroups {
    @Inject
    private StudyGroupDAO studyGroupDao;
    @Getter @Setter
    private StudyGroup studyGroupToCreate = new StudyGroup();
    @Getter
    private List<StudyGroup> allStudyGroups;

    @PostConstruct
    public void init(){
        loadAllStudyGroups();
    }

    @Transactional
    public void createStudyGroup(){
        this.studyGroupDao.persist(studyGroupToCreate);
    }

    private void loadAllStudyGroups(){
        this.allStudyGroups = studyGroupDao.loadAll();
    }

}
