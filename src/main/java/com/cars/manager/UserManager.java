package com.cars.manager;


import com.cars.model.User;

public interface UserManager {
    void registerUser(User user);
    User getUser(String email);

}
