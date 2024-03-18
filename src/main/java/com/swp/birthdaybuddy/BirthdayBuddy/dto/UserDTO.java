package com.swp.birthdaybuddy.BirthdayBuddy.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

public class UserDTO {
    private Long id;
    private String userName;
    private String password;
    @NotEmpty(message = "Confirm password is required")
    private String confirmPassword; // Include confirmPassword field
    private String fullName;
    @Email(message = "Email should be valid")
    private String email;
    @Pattern(regexp="[0-9]+", message = "Phone should only contain digits")
    private String phone;
    private Long roleId;

    public UserDTO() {
    }

    public UserDTO(Long id, String userName, String password, String confirmPassword, String fullName, String email, String phone, Long roleId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.roleId = roleId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
