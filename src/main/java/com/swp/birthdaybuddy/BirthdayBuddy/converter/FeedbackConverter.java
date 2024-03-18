package com.swp.birthdaybuddy.BirthdayBuddy.converter;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.FeedbackDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Feedback;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedbackConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public FeedbackConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public FeedbackDTO entityToDto(Feedback feedback) {
        return modelMapper.map(feedback, FeedbackDTO.class);
    }

    public Feedback dtoToEntity(FeedbackDTO feedbackDTO) {
        return modelMapper.map(feedbackDTO, Feedback.class);
    }
}
