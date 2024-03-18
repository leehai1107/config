package com.swp.birthdaybuddy.BirthdayBuddy.service.imp;

import com.swp.birthdaybuddy.BirthdayBuddy.converter.UserConverter;
import com.swp.birthdaybuddy.BirthdayBuddy.dto.UserDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.User;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.UserRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User user = userConverter.toEntity(userDTO);
        userRepository.save(user);
        return userConverter.toDTO(user);
    }

    @Override
    public boolean login(String username, String password) {
        User user = userRepository.findByUserName(username);
        return user != null && user.getPassword().equals(password);
    }
    @Override
    public void logOut(UserDTO userDTO) {
        // Perform logout logic
        // For example, you can invalidate user session or clear authentication token
        System.out.println("User logged out: " + userDTO.getUserName());
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDTO updateUser(Long userId, UserDTO updatedUserDTO) {
        Optional<User> userOptional = userRepository.findById(userId);
        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();
            existingUser.setUserName(updatedUserDTO.getUserName());
            existingUser.setPassword(updatedUserDTO.getPassword());
            // Set other properties accordingly
            userRepository.save(existingUser);
            return userConverter.toDTO(existingUser);
        } else {
            throw new RuntimeException("User not found");
        }
    }

    @Override
    public UserDTO getUser(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        return userOptional.map(userConverter::toDTO)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(userConverter::toDTO)
                .collect(Collectors.toList());
    }
}
