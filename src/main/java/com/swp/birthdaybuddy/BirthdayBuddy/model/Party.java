package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Parties")
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partyID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "restaurantID")
    private Restaurant restaurant;
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;
    @ManyToOne
    @JoinColumn(name = "partyPackageID")
    private PartyPackage partyPackage;
    @Column
    private String parentName;
    @Column
    private String phone;
    @Column
    private String kidName;
    @Column
    private String gender;
    @Column
    private Integer age;
    @OneToMany(mappedBy = "party")
    private List<SpecialService> specialServices;

    @OneToMany(mappedBy = "party")
    private List<PartyTheme> partyThemes;

    @OneToMany(mappedBy = "party")
    private List<Menu> menus;
    @Column(name = "numberOfGuests")
    private Integer numberOfGuests;
    @Column(name = "bookingDate")
    private Date bookingDate;
    @Column(name = "startDate")
    private String startTime;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column
    private Integer totalPrice;
    @Column
    private String status;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    public Party() {
    }

    public Party(Long id, Restaurant restaurant, User user, PartyPackage partyPackage, String parentName, String phone, String kidName, String gender, Integer age, List<SpecialService> specialServices, List<PartyTheme> partyThemes, List<Menu> menus, Integer numberOfGuests, Date bookingDate, String startTime, String description, Integer totalPrice, String status, Date createdDate) {
        this.id = id;
        this.restaurant = restaurant;
        this.user = user;
        this.partyPackage = partyPackage;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public PartyPackage getPartyPackage() {
        return partyPackage;
    }

    public void setPartyPackage(PartyPackage partyPackage) {
        this.partyPackage = partyPackage;
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

