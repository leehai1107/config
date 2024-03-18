package com.swp.birthdaybuddy.BirthdayBuddy.controller;

import com.swp.birthdaybuddy.BirthdayBuddy.converter.UserConverter;
import com.swp.birthdaybuddy.BirthdayBuddy.dto.UserDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.User;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.UserRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    // Đăng ký user
    @PostMapping("/register")
    public ResponseEntity<?> createUser(@Valid @RequestBody UserDTO userDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            // If there are validation errors, return the error messages
            List<String> errors = bindingResult.getAllErrors().stream()
                    .map(DefaultMessageSourceResolvable::getDefaultMessage)
                    .collect(Collectors.toList());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(errors);
        } else {
            UserDTO createdUserDTO = userService.createUser(userDTO);
            if (createdUserDTO != null) {
                return ResponseEntity.status(HttpStatus.CREATED)
                        .body("User created successfully: " + createdUserDTO.getUserName());
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("Failed to create user. Please try again.");
            }
        }
    }
    //update return data
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByUserName(username);
        if (user != null && user.getPassword().equals(password)) { // Validate password
            UserDTO userDTO = userConverter.toDTO(user);
            return ResponseEntity.ok(userDTO);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Login failed. Incorrect username or password.");
        }
    }

    @PostMapping("/logout")
    public void logOut(@RequestBody UserDTO userDTO) {
        userService.logOut(userDTO);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserDTO> getUser(@PathVariable Long userId) {
        UserDTO userDTO = userService.getUser(userId);
        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> userDTOList = userService.getAllUsers();
        return ResponseEntity.ok(userDTOList);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
        userService.deleteUser(userId);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/update/{userId}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long userId, @RequestBody UserDTO updatedUserDTO) {
        UserDTO userDTO = userService.updateUser(userId, updatedUserDTO);
        return ResponseEntity.ok(userDTO);
    }
}
