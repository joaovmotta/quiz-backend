package com.quizgame.service;

import com.quizgame.entity.Alternative;
import com.quizgame.entity.Question;
import com.quizgame.repository.AlternativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AlternativeService {

    @Autowired
    private AlternativeRepository alternativeRepository;

    @Transactional(rollbackOn = Exception.class)
    public void saveAlternatives(Question question, List<Alternative> alternatives){

        alternatives.forEach(a -> {
            a.setQuestion(question);
            alternativeRepository.save(a);
        });
    }
}
