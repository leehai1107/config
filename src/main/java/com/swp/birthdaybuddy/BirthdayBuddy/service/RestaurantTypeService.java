package com.swp.birthdaybuddy.BirthdayBuddy.service;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.RestaurantTypeDTO;

import java.util.List;

public interface RestaurantTypeService {
    RestaurantTypeDTO getRestaurantTypeById(Long id);
    List<RestaurantTypeDTO> getAllRestaurantType();
}
