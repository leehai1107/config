package com.swp.birthdaybuddy.BirthdayBuddy.dto;

import com.swp.birthdaybuddy.BirthdayBuddy.model.Party;

import java.math.BigDecimal;

public class PartyShowcaseDTO {
    private Long partyShowcaseID;
    private Party party;
    private BigDecimal rating;
    private String description;
    private String comments;
    private String imgLink;

    public PartyShowcaseDTO() {
    }

    public PartyShowcaseDTO(Long partyShowcaseID, Party party, BigDecimal rating, String description, String comments, String imgLink) {
        this.partyShowcaseID = partyShowcaseID;
        this.party = party;
        this.rating = rating;
        this.description = description;
        this.comments = comments;
        this.imgLink = imgLink;
    }

    public Long getPartyShowcaseID() {
        return partyShowcaseID;
    }

    public void setPartyShowcaseID(Long partyShowcaseID) {
        this.partyShowcaseID = partyShowcaseID;
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
