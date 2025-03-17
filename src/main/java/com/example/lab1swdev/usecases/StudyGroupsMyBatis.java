package com.example.lab1swdev.usecases;

import com.example.lab1swdev.mybatis.dao.StudygroupMapper;
import com.example.lab1swdev.mybatis.model.Studygroup;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@Model
public class StudyGroupsMyBatis {
    @Inject
    private StudygroupMapper studyGroupMapper;

    @Getter
    private List<Studygroup> allStudyGroups;

    @Getter @Setter
    private Studygroup studyGroupToCreate = new Studygroup();

    @PostConstruct
    public void init() {
        this.loadAllStudyGroups();
    }

    private void loadAllStudyGroups() {
        this.allStudyGroups = studyGroupMapper.selectAll();
    }

    @Transactional
    public String createStudyGroup() {
        studyGroupMapper.insert(studyGroupToCreate);
        return "/myBatis/studyGroups?faces-redirect=true";
    }
}
