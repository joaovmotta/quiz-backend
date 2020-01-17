package com.quizgame.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AlternativeRequest {

    private String text;

    @JsonProperty("is-correct-awnser")
    private Boolean isCorrectAwnser;
}
