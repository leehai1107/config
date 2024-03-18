package com.swp.birthdaybuddy.BirthdayBuddy.repository;

import com.swp.birthdaybuddy.BirthdayBuddy.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
