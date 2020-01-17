package com.quizgame.request.mappers;

import com.quizgame.entity.Category;
import com.quizgame.entity.Difficulty;
import com.quizgame.entity.Question;
import com.quizgame.request.QuestionRequest;
import org.springframework.stereotype.Component;

@Component
public class QuestionMapper {

    public Question convertRequestToEntity(QuestionRequest questionRequest){

        Question question = new Question();
        question.setCategory(new Category(questionRequest.getCategoryId()));
        question.setDifficulty(new Difficulty(questionRequest.getDifficultyId()));
        question.setText(questionRequest.getText());

        return question;
    }
}
