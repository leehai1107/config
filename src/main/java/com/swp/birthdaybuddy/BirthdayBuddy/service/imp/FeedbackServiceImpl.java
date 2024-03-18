package com.swp.birthdaybuddy.BirthdayBuddy.service.imp;

import com.swp.birthdaybuddy.BirthdayBuddy.converter.FeedbackConverter;
import com.swp.birthdaybuddy.BirthdayBuddy.dto.FeedbackDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Feedback;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.FeedbackRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;
    private final FeedbackConverter feedbackConverter;

    @Autowired
    public FeedbackServiceImpl(FeedbackRepository feedbackRepository, FeedbackConverter feedbackConverter) {
        this.feedbackRepository = feedbackRepository;
        this.feedbackConverter = feedbackConverter;
    }

    @Override
    public FeedbackDTO createFeedback(FeedbackDTO feedbackDTO) {
        Feedback feedback = feedbackConverter.dtoToEntity(feedbackDTO);
        feedback = feedbackRepository.save(feedback);
        return feedbackConverter.entityToDto(feedback);
    }

    @Override
    public void deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
    }

    @Override
    public FeedbackDTO getFeedback(Long id) {
        Feedback feedback = feedbackRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Feedback not found with id: " + id));
        return feedbackConverter.entityToDto(feedback);
    }

    @Override
    public List<FeedbackDTO> getAllFeedbacks() {
        List<Feedback> feedbacks = feedbackRepository.findAll();
        return feedbacks.stream()
                .map(feedbackConverter::entityToDto)
                .collect(Collectors.toList());
    }

    @Override
    public FeedbackDTO updateFeedback(Long id, FeedbackDTO feedbackDTO) {
        Feedback existingFeedback = feedbackRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Feedback not found with id: " + id));

        existingFeedback.setFeedbackText(feedbackDTO.getFeedbackText());
        existingFeedback.setRating(feedbackDTO.getRating());

        Feedback updatedFeedback = feedbackRepository.save(existingFeedback);
        return feedbackConverter.entityToDto(updatedFeedback);
    }
}
