package com.swp.birthdaybuddy.BirthdayBuddy.controller;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.RestaurantDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/restaurants")
public class RestaurantController {

    private final RestaurantService restaurantService;

    @Autowired
    public RestaurantController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @GetMapping("/{id}")
    public RestaurantDTO getRestaurant(@PathVariable("id") Long id) {
        return restaurantService.getRestaurant(id);
    }

    @GetMapping("/all")
    public List<RestaurantDTO> getAllRestaurants() {
        return restaurantService.getAllRestaurants();
    }

    @PostMapping("/create")
    public RestaurantDTO createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {
        return restaurantService.createRestaurant(restaurantDTO);
    }

    @PutMapping("/update/{id}")
    public RestaurantDTO updateRestaurant(@PathVariable("id") Long id, @RequestBody RestaurantDTO restaurantDTO) {
        return restaurantService.updateRestaurant(id, restaurantDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteRestaurant(@PathVariable("id") Long id) {
        restaurantService.deleteRestaurant(id);
    }
}
