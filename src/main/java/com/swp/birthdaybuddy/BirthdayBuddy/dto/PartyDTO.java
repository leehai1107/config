package com.swp.birthdaybuddy.BirthdayBuddy.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class PartyDTO {
    private Long id;
    private Long restaurantId;
    private Long userId;
    private Long partyPackageId;

    private String parentName;
    private String phone;
    private String kidName;
    private String gender;
    private Integer age;
    private List<String> specialServices;
    private List<String> partyThemes;
    private List<String> menus;
    private Integer numberOfGuests;
    private Date bookingDate;
    private String startTime;
    private String description;
    private Integer totalPrice;
    private String status;
    private Date createdDate;

    public PartyDTO() {
    }

    public PartyDTO(Long id, Long restaurantId, Long userId, Long partyPackageId, String parentName, String phone, String kidName, String gender, Integer age, List<String> specialServices, List<String> partyThemes, List<String> menus, Integer numberOfGuests, Date bookingDate, String startTime, String description, Integer totalPrice, String status, Date createdDate) {
        this.id = id;
        this.restaurantId = restaurantId;
        this.userId = userId;
        this.partyPackageId = partyPackageId;
        this.parentName = parentName;
        this.phone = phone;
        this.kidName = kidName;
        this.gender = gender;
        this.age = age;
        this.specialServices = specialServices;
        this.partyThemes = partyThemes;
        this.menus = menus;
        this.numberOfGuests = numberOfGuests;
        this.bookingDate = bookingDate;
        this.startTime = startTime;
        this.description = description;
        this.totalPrice = totalPrice;
        this.status = status;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPartyPackageId() {
        return partyPackageId;
    }

    public void setPartyPackageId(Long partyPackageId) {
        this.partyPackageId = partyPackageId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getKidName() {
        return kidName;
    }

    public void setKidName(String kidName) {
        this.kidName = kidName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Integer getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(Integer numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
