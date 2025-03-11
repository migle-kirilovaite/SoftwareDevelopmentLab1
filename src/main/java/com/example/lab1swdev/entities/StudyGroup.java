package com.example.lab1swdev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter @Getter
public class StudyGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic(optional = false)
    private String specialty;
    @Basic(optional = false)
    private Integer course;
    @OneToMany(mappedBy = "group")
    private List<Student> students;
}