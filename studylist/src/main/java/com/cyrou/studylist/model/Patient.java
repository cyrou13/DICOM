package com.cyrou.studylist.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    @OneToMany
    private Set<Study> studies = new HashSet<>();


    public Patient() {

    }

    public Patient(String name) {
        this.name = name;
    }

}
