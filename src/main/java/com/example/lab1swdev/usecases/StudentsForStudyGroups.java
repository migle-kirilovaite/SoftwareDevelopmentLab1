package com.example.lab1swdev.usecases;

import com.example.lab1swdev.entities.Student;
import com.example.lab1swdev.entities.StudyGroup;
import com.example.lab1swdev.interceptors.LoggedInvocation;
import com.example.lab1swdev.persistence.StudentsDAO;
import com.example.lab1swdev.persistence.StudyGroupDAO;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.Map;

@Model
public class StudentsForStudyGroups {
    @Inject
    private StudyGroupDAO studyGroupDAO;

    @Inject
    private StudentsDAO studentsDao;

    @Getter @Setter
    private StudyGroup studyGroup;

    @Getter @Setter
    private Student studentToCreate = new Student();

    @PostConstruct
    public void init(){
        Map<String, String> requestParameters =
                FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        Integer teamId = Integer.parseInt(requestParameters.get("studyGroupId"));
        this.studyGroup = studyGroupDAO.findOne(teamId);
    }

    @Transactional
    @LoggedInvocation
    public void createStudent() {
        studentToCreate.setGroup(this.studyGroup);
        studentsDao.persist(studentToCreate);
    }

}
