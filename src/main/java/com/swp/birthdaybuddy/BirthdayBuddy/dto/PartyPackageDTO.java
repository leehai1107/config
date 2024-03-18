package com.swp.birthdaybuddy.BirthdayBuddy.dto;

import java.math.BigDecimal;
import java.util.List;

public class PartyPackageDTO {
    private Long id;
    private List<String> specialServices;
    private List<String> partyThemes;
    private List<String> menus;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(List<String> specialServices) {
        this.specialServices = specialServices;
    }

    public List<String> getPartyThemes() {
        return partyThemes;
    }

    public void setPartyThemes(List<String> partyThemes) {
        this.partyThemes = partyThemes;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
