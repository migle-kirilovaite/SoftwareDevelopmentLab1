package com.example.lab1swdev.mybatis.model;

import java.util.List;


public class Electivecourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ELECTIVECOURSE.ID
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.ELECTIVECOURSE.NAME
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ELECTIVECOURSE.ID
     *
     * @return the value of PUBLIC.ELECTIVECOURSE.ID
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    private List<Student> students; // Add this line

    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ELECTIVECOURSE.ID
     *
     * @param id the value for PUBLIC.ELECTIVECOURSE.ID
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.ELECTIVECOURSE.NAME
     *
     * @return the value of PUBLIC.ELECTIVECOURSE.NAME
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.ELECTIVECOURSE.NAME
     *
     * @param name the value for PUBLIC.ELECTIVECOURSE.NAME
     *
     * @mbg.generated Sun Mar 16 10:54:11 EET 2025
     */
    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() { return students; }

    public void setStudents(List<Student> students) { this.students = students; }
}