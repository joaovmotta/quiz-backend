package com.quizgame.service;

import com.quizgame.entity.Alternative;
import com.quizgame.entity.Category;
import com.quizgame.entity.Difficulty;
import com.quizgame.entity.Question;
import com.quizgame.repository.CategoryRepository;
import com.quizgame.repository.DifficultyRepository;
import com.quizgame.repository.QuestionRepository;
import com.quizgame.request.QuestionRequest;
import com.quizgame.request.mappers.AlternativeMapper;
import com.quizgame.request.mappers.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private AlternativeMapper alternativeMapper;

    @Autowired
    private AlternativeService alternativeService;

    @Transactional(rollbackFor = Exception.class)
    public void save(QuestionRequest questionRequest){

        Question question = questionMapper.convertRequestToEntity(questionRequest);
        question = questionRepository.save(question);

        List<Alternative> alternatives = questionRequest.getAlternatives()
                                            .stream().map(a -> alternativeMapper.convertRequestToEntity(a)).collect(Collectors.toList());

        alternativeService.saveAlternatives(question, alternatives);
    }

    @Transactional(readOnly = true, rollbackFor = Exception.class)
    public List<Question> findQuestions(Map<String, String> searchParams){

        List<Question> questions = questionRepository.findAll();

        return questions;
    }
}
