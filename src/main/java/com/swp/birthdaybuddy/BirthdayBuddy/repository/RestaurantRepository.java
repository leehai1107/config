package com.swp.birthdaybuddy.BirthdayBuddy.repository;

import com.swp.birthdaybuddy.BirthdayBuddy.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {

}
