package com.swp.birthdaybuddy.BirthdayBuddy.model;

import jakarta.persistence.*;
import lombok.ToString;

import java.util.Collection;
import java.util.Set;
@Entity
@Table(name = "Roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roleid")
    private Long id;

    @Column(name = "roleName", nullable = false, unique = true)
    private String roleName;

    @OneToMany(mappedBy = "role")
    private Collection<User> users;

    public Role() {
    }

    public Role(Long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
