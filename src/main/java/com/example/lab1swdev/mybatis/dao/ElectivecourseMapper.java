package com.example.lab1swdev.mybatis.dao;

import com.example.lab1swdev.mybatis.model.Electivecourse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ElectivecourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ELECTIVECOURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ELECTIVECOURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    int insert(Electivecourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ELECTIVECOURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    Electivecourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ELECTIVECOURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    List<Electivecourse> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ELECTIVECOURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    int updateByPrimaryKey(Electivecourse record);
}