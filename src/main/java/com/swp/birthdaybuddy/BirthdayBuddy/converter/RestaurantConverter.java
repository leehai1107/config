package com.swp.birthdaybuddy.BirthdayBuddy.converter;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.RestaurantDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Restaurant;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestaurantConverter {
    private final ModelMapper modelMapper;

    @Autowired
    public RestaurantConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public RestaurantDTO toDTO(Restaurant restaurant) {
        return modelMapper.map(restaurant, RestaurantDTO.class);
    }

    public Restaurant toEntity(RestaurantDTO restaurantDTO) {
        return modelMapper.map(restaurantDTO, Restaurant.class);
    }
}
