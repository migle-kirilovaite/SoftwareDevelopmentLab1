package com.example.lab1swdev.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NamedQueries({
        @NamedQuery(name = "StudyGroup.findAll", query = "SELECT sg FROM StudyGroup sg")
})
@Setter @Getter
public class StudyGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Basic(optional = false)
    private String name;
    @OneToMany(mappedBy = "group")
    private List<Student> students;
}