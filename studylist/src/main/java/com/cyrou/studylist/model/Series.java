package com.cyrou.studylist.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Series {

    private String uid;

    private String description;

    @Lob
    private Byte[] thumbnail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Series() {
    }

    public Series(String uid, String description) {
        this.uid = uid;
        this.description = description;
    }

}
