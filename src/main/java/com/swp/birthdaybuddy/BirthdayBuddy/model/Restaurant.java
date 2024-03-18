package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalTime;


@Entity
@Table(name = "Restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurantID")
    private Long id;

    @Column(name = "restaurantName", nullable = false)
    private String restaurantName;
    @Column
    private String phone;
    @Column
    private String startDate;
    @Column
    private String endDate;
    @ManyToOne
    @JoinColumn(name = "typeID")
    private RestaurantType restaurantType;

    @Column(name = "address")
    private String address;

    @ManyToOne
    @JoinColumn(name = "userID") // Change to userID
    private User user; // Change to User

    public Restaurant() {
    }

    public Restaurant(Long id, String restaurantName, String phone, String startDate, String endDate, RestaurantType restaurantType, String address, User user) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.phone = phone;
        this.startDate = startDate;
        this.endDate = endDate;
        this.restaurantType = restaurantType;
        this.address = address;
        this.user = user;
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

    public RestaurantType getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(RestaurantType restaurantType) {
        this.restaurantType = restaurantType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
