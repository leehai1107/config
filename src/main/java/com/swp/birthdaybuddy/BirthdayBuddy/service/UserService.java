package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    boolean login(String username, String password);
    void logOut(UserDTO userDTO);
    UserDTO getUser(Long userId);
    List<UserDTO> getAllUsers();
    void deleteUser(Long userId);
    UserDTO updateUser(Long userId, UserDTO updatedUserDTO);
}
