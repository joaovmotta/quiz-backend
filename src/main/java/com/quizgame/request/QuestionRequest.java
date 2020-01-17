package com.quizgame.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class QuestionRequest {

    private String text;

    private List<AlternativeRequest> alternatives;

    @JsonProperty("category-id")
    private Long categoryId;

    @JsonProperty("difficulty-id")
    private Long DifficultyId;
}
