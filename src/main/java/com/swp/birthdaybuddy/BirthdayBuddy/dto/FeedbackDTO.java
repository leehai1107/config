package com.swp.birthdaybuddy.BirthdayBuddy.dto;

public class FeedbackDTO {
    private Long feedbackId;
    private Long partyId;
    private Long userId;
    private String feedbackText;
    private int rating;

    public FeedbackDTO() {
    }

    public FeedbackDTO(Long feedbackId, Long partyId, Long userId, String feedbackText, int rating) {
        this.feedbackId = feedbackId;
        this.partyId = partyId;
        this.userId = userId;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Long getPartyId() {
        return partyId;
    }

    public void setPartyId(Long partyId) {
        this.partyId = partyId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFeedbackText() {
        return feedbackText;
    }

    public void setFeedbackText(String feedbackText) {
        this.feedbackText = feedbackText;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
