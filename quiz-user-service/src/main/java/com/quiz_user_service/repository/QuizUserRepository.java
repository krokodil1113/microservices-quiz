package com.quiz_user_service.repository;

import com.quiz_user_service.entity.QuizUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizUserRepository extends JpaRepository<QuizUser, Long> {
}
