package com.example.lab1swdev.mybatis.model;

public class Studygroup {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDYGROUP.ID
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDYGROUP.COURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    private Integer course;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.STUDYGROUP.SPECIALTY
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    private String specialty;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDYGROUP.ID
     *
     * @return the value of PUBLIC.STUDYGROUP.ID
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDYGROUP.ID
     *
     * @param id the value for PUBLIC.STUDYGROUP.ID
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDYGROUP.COURSE
     *
     * @return the value of PUBLIC.STUDYGROUP.COURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    public Integer getCourse() {
        return course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDYGROUP.COURSE
     *
     * @param course the value for PUBLIC.STUDYGROUP.COURSE
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    public void setCourse(Integer course) {
        this.course = course;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.STUDYGROUP.SPECIALTY
     *
     * @return the value of PUBLIC.STUDYGROUP.SPECIALTY
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.STUDYGROUP.SPECIALTY
     *
     * @param specialty the value for PUBLIC.STUDYGROUP.SPECIALTY
     *
     * @mbg.generated Sat Mar 08 16:02:29 EET 2025
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}