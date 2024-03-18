package com.swp.birthdaybuddy.BirthdayBuddy.converter;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.RoleDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Role;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleDTO toDTO(Role role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId());
        roleDTO.setName(role.getRoleName());
        return roleDTO;
    }

    public Role toEntity(RoleDTO roleDTO) {
        Role role = new Role();
        role.setId(roleDTO.getId());
        role.setRoleName(roleDTO.getName());
        return role;
    }
}
