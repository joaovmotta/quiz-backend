package com.quizgame.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Difficulty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "difficulty", cascade = CascadeType.ALL)
    private List<Question> questions;

    public Difficulty(Long id){
        this.id = id;
    }

    public Difficulty(){}
}
