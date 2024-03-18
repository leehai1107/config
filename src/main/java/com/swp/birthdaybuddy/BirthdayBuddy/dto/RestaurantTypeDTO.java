package com.swp.birthdaybuddy.BirthdayBuddy.dto;

public class RestaurantTypeDTO {
    private Long typeId;
    private String typeName;
    private String description;
    private String imgLink;

    // Constructors, getters, and setters

    public RestaurantTypeDTO() {
    }

    public RestaurantTypeDTO(Long typeId, String typeName, String description, String imgLink) {
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
