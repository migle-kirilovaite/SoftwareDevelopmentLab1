package com.example.lab1swdev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "ElectiveCourse.findAll", query = "SELECT e FROM ElectiveCourse e")
})
@Setter @Getter
public class ElectiveCourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic(optional = false)
    private String name;
    @ManyToMany(mappedBy = "electiveCourses")
    private List<Student> students = new ArrayList<>();
}
