package com.quizgame.request.mappers;

import com.quizgame.entity.Alternative;
import com.quizgame.request.AlternativeRequest;
import org.springframework.stereotype.Component;

@Component
public class AlternativeMapper {

    public Alternative convertRequestToEntity(AlternativeRequest alternativeRequest){

        Alternative alternative = new Alternative();

        alternative.setIsCorrectAlternative(alternativeRequest.getIsCorrectAwnser());
        alternative.setText(alternativeRequest.getText());

        return alternative;
    }
}
