// RestaurantTypeRepository.java
package com.swp.birthdaybuddy.BirthdayBuddy.repository;

import com.swp.birthdaybuddy.BirthdayBuddy.model.RestaurantType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantTypeRepository extends JpaRepository<RestaurantType, Long> {
}
