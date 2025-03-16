package com.example.lab1swdev.mybatis.dao;

import com.example.lab1swdev.mybatis.model.Student;
import com.example.lab1swdev.mybatis.model.Electivecourse;
import java.util.List;

public interface StudentElectivecourseMapper {
    List<Student> selectStudentsByElectivecourseId(Integer electivecourseId);
    List<Electivecourse> selectElectivecoursesByStudentId(Integer studentId);
}