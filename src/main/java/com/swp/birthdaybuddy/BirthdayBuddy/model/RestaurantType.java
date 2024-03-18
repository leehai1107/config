package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_types")
public class RestaurantType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "typeID")
    private Long typeId;

    @Column(name = "typeName", nullable = false)
    private String typeName;
    @Column(name ="description", length = 10000)
    private String description;
    @Column
    private String imgLink;

    // Constructors, getters, and setters

    public RestaurantType() {
    }

    public RestaurantType(Long typeId, String typeName, String description, String imgLink) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.imgLink = imgLink;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}

