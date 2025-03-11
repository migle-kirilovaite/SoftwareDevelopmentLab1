package com.example.lab1swdev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter @Getter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic(optional = false)
    private String name;
    @Basic(optional = false)
    private String lastName;
    @ManyToOne
    private StudyGroup group;
    @ManyToMany
    private List<ElectiveCourse> electiveCourses;
}
