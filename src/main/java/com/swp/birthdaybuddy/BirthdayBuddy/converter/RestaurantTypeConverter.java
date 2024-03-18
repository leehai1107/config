package com.swp.birthdaybuddy.BirthdayBuddy.converter;

import com.swp.birthdaybuddy.BirthdayBuddy.dto.RestaurantTypeDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.RestaurantType;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestaurantTypeConverter {

    private final ModelMapper modelMapper;

    @Autowired
    public RestaurantTypeConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public RestaurantTypeDTO convertToDTO(RestaurantType restaurantType) {
        return modelMapper.map(restaurantType, RestaurantTypeDTO.class);
    }
}
