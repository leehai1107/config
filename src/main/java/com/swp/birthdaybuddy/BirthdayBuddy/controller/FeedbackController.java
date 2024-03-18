package com.swp.birthdaybuddy.BirthdayBuddy.controller;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.FeedbackDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/feedbacks")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping("/create")
    public FeedbackDTO createFeedback(@RequestBody FeedbackDTO feedbackDTO) {
        return feedbackService.createFeedback(feedbackDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable Long id) {
        feedbackService.deleteFeedback(id);
    }

    @GetMapping("/{id}")
    public FeedbackDTO getFeedback(@PathVariable Long id) {
        return feedbackService.getFeedback(id);
    }

    @GetMapping("/getAll")
    public List<FeedbackDTO> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @PutMapping("/{id}")
    public FeedbackDTO updateFeedback(@PathVariable Long id, @RequestBody FeedbackDTO feedbackDTO) {
        return feedbackService.updateFeedback(id, feedbackDTO);
    }
}
