package com.example.lab1swdev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "Student.findAll", query = "SELECT s FROM Student s")
})
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
    private List<ElectiveCourse> electiveCourses = new ArrayList<>();
}
