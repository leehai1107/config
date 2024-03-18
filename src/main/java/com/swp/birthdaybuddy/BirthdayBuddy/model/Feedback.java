package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    @ManyToOne
    @JoinColumn(name = "partyID")
    private Party party;

    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;

    private String feedbackText;
    private int rating; // Assuming rating is an integer value

    public Feedback() {
    }

    public Feedback(Long feedbackId, Party party, User user, String feedbackText, int rating) {
        this.feedbackId = feedbackId;
        this.party = party;
        this.user = user;
        this.feedbackText = feedbackText;
        this.rating = rating;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
