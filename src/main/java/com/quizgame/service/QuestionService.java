package com.quizgame.service;

import com.quizgame.entity.Alternative;
import com.quizgame.entity.Question;
import com.quizgame.repository.QuestionRepository;
import com.quizgame.request.QuestionRequest;
import com.quizgame.request.mappers.AlternativeMapper;
import com.quizgame.request.mappers.QuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
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

    @Transactional(rollbackOn = Exception.class)
    public void save(QuestionRequest questionRequest){

        Question question = questionMapper.convertRequestToEntity(questionRequest);
        question = questionRepository.save(question);

        List<Alternative> alternatives = questionRequest.getAlternatives()
                                            .stream().map(a -> alternativeMapper.convertRequestToEntity(a)).collect(Collectors.toList());

        alternativeService.saveAlternatives(question, alternatives);
    }
}
