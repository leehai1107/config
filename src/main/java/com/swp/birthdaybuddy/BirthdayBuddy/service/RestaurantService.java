package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.RestaurantDTO;

import java.util.List;

public interface RestaurantService {
    RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO);
    RestaurantDTO getRestaurant(Long id);
    List<RestaurantDTO> getAllRestaurants();
    RestaurantDTO updateRestaurant(Long id, RestaurantDTO restaurantDTO);
    void deleteRestaurant(Long id);
}
