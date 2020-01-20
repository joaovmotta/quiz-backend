package com.quizgame.controller;

import com.quizgame.request.QuestionRequest;
import com.quizgame.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/quiz/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping
    public HttpEntity saveNewQuestion(@RequestBody QuestionRequest questionRequest){

        questionService.save(questionRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public HttpEntity findQuestions(@MatrixVariable Map<String, String> searchParams){

        return ResponseEntity.ok(questionService.findQuestions(searchParams));
    }

}
