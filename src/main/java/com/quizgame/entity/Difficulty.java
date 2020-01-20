package com.quizgame.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Difficulty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "difficulty", cascade = CascadeType.ALL)
    @JsonBackReference
    private List<Question> questions;

    public Difficulty(Long id){
        this.id = id;
    }

    public Difficulty(){}
}
