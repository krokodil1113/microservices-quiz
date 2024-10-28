package com.quiz_user_service.service.impl;

import com.quiz_user_service.entity.QuizUser;
import com.quiz_user_service.repository.QuizUserRepository;
import com.quiz_user_service.service.QuizUserService;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class QuizUserServiceImpl implements QuizUserService {

    private final QuizUserRepository quizUserRepository;

    public QuizUserServiceImpl(QuizUserRepository quizUserRepository) {
        this.quizUserRepository = quizUserRepository;
    }

    public QuizUser createUser(QuizUser user) {
        return quizUserRepository.save(user);
    }

    public QuizUser getUserById(Long id) {
       return quizUserRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    public List<QuizUser> getAllUsers() {

        return quizUserRepository.findAll();
    }
}
