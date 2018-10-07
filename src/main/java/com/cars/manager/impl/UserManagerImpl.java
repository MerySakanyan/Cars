package com.cars.manager.impl;

import com.cars.manager.UserManager;
import com.cars.model.User;
import com.cars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserRepository userRepository;


    @Transactional
    @Override
    public void registerUser(User user) {
        userRepository.addUser(user);
    }

    @Override
    public User getUser(String email) {
      return   userRepository.getUser(email);
    }



}
