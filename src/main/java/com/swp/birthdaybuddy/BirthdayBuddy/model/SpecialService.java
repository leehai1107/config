package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;

@Entity
public class SpecialService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "partyPackageID")
    private PartyPackage partyPackage;
    @ManyToOne
    @JoinColumn(name = "partyID")
    private Party party;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PartyPackage getPartyPackage() {
        return partyPackage;
    }

    public void setPartyPackage(PartyPackage partyPackage) {
        this.partyPackage = partyPackage;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
