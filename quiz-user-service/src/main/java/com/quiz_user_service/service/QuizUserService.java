package com.quiz_user_service.service;

import com.quiz_user_service.entity.QuizUser;

import java.util.List;

public interface QuizUserService {

     QuizUser createUser(QuizUser user);

     QuizUser getUserById(Long id);

     List<QuizUser> getAllUsers();
}
