package com.cyrou.studylist.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@EqualsAndHashCode(of = {"id","uid"})
public class Study {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uid;

    private String description;

    @OneToMany
    private Set<Series> series = new HashSet<>();

    public Study() {
    }

    public Study(String uid, String description) {
        this.uid = uid;
        this.description = description;
    }

}
