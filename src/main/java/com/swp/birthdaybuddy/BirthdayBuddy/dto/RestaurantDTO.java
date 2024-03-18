package com.swp.birthdaybuddy.BirthdayBuddy.dto;

import java.time.LocalDate;
import java.time.LocalTime;


public class RestaurantDTO {
    private Long id;
    private String restaurantName;
    private String phone;
    private String startDate;
    private String endDate;
    private Long typeId; // Assuming you want to transfer the type ID only
    private String partyTheme;
    private String specialService;
    private String address;

    public RestaurantDTO() {
    }

    public RestaurantDTO(Long id, String restaurantName, String phone, String startDate, String endDate, Long typeId, String partyTheme, String specialService, String address) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.phone = phone;
        this.startDate = startDate;
        this.endDate = endDate;
        this.typeId = typeId;
        this.partyTheme = partyTheme;
        this.specialService = specialService;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getPartyTheme() {
        return partyTheme;
    }

    public void setPartyTheme(String partyTheme) {
        this.partyTheme = partyTheme;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
