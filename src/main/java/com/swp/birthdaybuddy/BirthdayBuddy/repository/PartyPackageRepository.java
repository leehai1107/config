package com.swp.birthdaybuddy.BirthdayBuddy.repository;

import com.swp.birthdaybuddy.BirthdayBuddy.model.PartyPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyPackageRepository extends JpaRepository<PartyPackage, Long> {
}