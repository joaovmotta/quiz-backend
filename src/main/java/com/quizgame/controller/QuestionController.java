package com.quizgame.controller;

import com.quizgame.request.QuestionRequest;
import com.quizgame.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quiz")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/question")
    public HttpEntity saveNewQuestion(@RequestBody QuestionRequest questionRequest){

        questionService.save(questionRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
