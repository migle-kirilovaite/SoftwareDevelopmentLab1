package com.example.lab1swdev.persistence;

import com.example.lab1swdev.mybatis.dao.StudygroupMapper;
import com.example.lab1swdev.mybatis.model.Studygroup;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MyBatisStudyGroupDAO {

    @Inject
    private StudygroupMapper studyGroupMapper;

    public List<Studygroup> getAllStudyGroups() {
        return studyGroupMapper.selectAll();
    }

    @Transactional
    public void createStudyGroup(Studygroup studyGroup) {
        studyGroupMapper.insert(studyGroup);
    }
}
