// PartyPackage.java
package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "PartyPackages")
public class PartyPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "partyPackage")
    private List<SpecialService> specialServices;

    @OneToMany(mappedBy = "partyPackage")
    private List<PartyTheme> partyThemes;

    @OneToMany(mappedBy = "partyPackage")
    private List<Menu> menus;

    private BigDecimal price;


    public PartyPackage() {
    }

    public PartyPackage(Long id, List<SpecialService> specialServices, List<PartyTheme> partyThemes, List<Menu> menus, BigDecimal price) {
        this.id = id;
        this.specialServices = specialServices;
        this.partyThemes = partyThemes;
        this.menus = menus;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<SpecialService> getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(List<SpecialService> specialServices) {
        this.specialServices = specialServices;
    }

    public List<PartyTheme> getPartyThemes() {
        return partyThemes;
    }

    public void setPartyThemes(List<PartyTheme> partyThemes) {
        this.partyThemes = partyThemes;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
