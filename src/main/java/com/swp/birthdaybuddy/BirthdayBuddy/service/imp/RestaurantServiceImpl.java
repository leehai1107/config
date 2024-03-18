package com.swp.birthdaybuddy.BirthdayBuddy.service.imp;

import com.swp.birthdaybuddy.BirthdayBuddy.converter.RestaurantConverter;
import com.swp.birthdaybuddy.BirthdayBuddy.dto.RestaurantDTO;
import com.swp.birthdaybuddy.BirthdayBuddy.model.Restaurant;
import com.swp.birthdaybuddy.BirthdayBuddy.repository.RestaurantRepository;
import com.swp.birthdaybuddy.BirthdayBuddy.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    private final RestaurantRepository restaurantRepository;
    private final RestaurantConverter restaurantConverter;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository, RestaurantConverter restaurantConverter) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantConverter = restaurantConverter;
    }

    @Override
    public RestaurantDTO getRestaurant(Long restaurantId) {
        Restaurant restaurant = restaurantRepository.findById(restaurantId).orElse(null);
        return restaurantConverter.toDTO(restaurant);
    }

    @Override
    public List<RestaurantDTO> getAllRestaurants() {
        List<Restaurant> restaurants = restaurantRepository.findAll();
        return restaurants.stream()
                .map(restaurantConverter::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {
        Restaurant restaurant = restaurantConverter.toEntity(restaurantDTO);
        Restaurant savedRestaurant = restaurantRepository.save(restaurant);
        return restaurantConverter.toDTO(savedRestaurant);
    }

    @Override
    public RestaurantDTO updateRestaurant(Long id, RestaurantDTO restaurantDTO) {
        // Check if the restaurant exists
        if (!restaurantRepository.existsById(id)) {
            throw new RuntimeException("Restaurant not found with id: " + id);
        }
        restaurantDTO.setId(id);
        Restaurant restaurantToUpdate = restaurantConverter.toEntity(restaurantDTO);
        Restaurant updatedRestaurant = restaurantRepository.save(restaurantToUpdate);
        return restaurantConverter.toDTO(updatedRestaurant);
    }

    @Override
    public void deleteRestaurant(Long id) {
        // Check if the restaurant exists
        if (!restaurantRepository.existsById(id)) {
            throw new RuntimeException("Restaurant not found with id: " + id);
        }
        restaurantRepository.deleteById(id);
    }
}
