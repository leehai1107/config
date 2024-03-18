package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.FeedbackDTO;

import java.util.List;

public interface FeedbackService {
    FeedbackDTO createFeedback(FeedbackDTO feedbackDTO);

    void deleteFeedback(Long id);

    FeedbackDTO getFeedback(Long id);

    List<FeedbackDTO> getAllFeedbacks();

    FeedbackDTO updateFeedback(Long id, FeedbackDTO feedbackDTO);
}
