package com.example.lab1swdev.mybatis.dao;

import com.example.lab1swdev.mybatis.model.Studygroup;
import java.util.List;

public interface StudygroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDYGROUP
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDYGROUP
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    int insert(Studygroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDYGROUP
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    Studygroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDYGROUP
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    List<Studygroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.STUDYGROUP
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    int updateByPrimaryKey(Studygroup record);
}