package com.cars.repository;

import com.cars.model.User;

public interface UserRepository {
    void addUser(User user);
    User getUser(String email);
    User getUserById(int id);
    void update(User user);
}
