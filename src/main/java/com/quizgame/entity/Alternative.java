package com.quizgame.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Alternative {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    private Boolean isCorrectAlternative;
}
