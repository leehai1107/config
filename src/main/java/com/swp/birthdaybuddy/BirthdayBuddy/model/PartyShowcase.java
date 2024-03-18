package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "PartyShowcases")
public class PartyShowcase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partyShowcaseID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "partyID")
    private Party party;

    @Column(name = "rating")
    private BigDecimal rating;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "comments", columnDefinition = "TEXT")
    private String comments;

    @Column(name = "imgLink", columnDefinition = "TEXT")
    private String imgLink;

    public PartyShowcase() {
    }

    public PartyShowcase(Long id, Party party, BigDecimal rating, String description, String comments, String imgLink) {
        this.id = id;
        this.party = party;
        this.rating = rating;
        this.description = description;
        this.comments = comments;
        this.imgLink = imgLink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}
