package com.cars.repository;

import com.cars.model.Car;
import com.cars.model.User;

import java.util.List;

public interface CarRepository {
    Car getCarById(int id);
    void update(Car car);
    List<Car> getByUser(User user) ;
    List<Car> getCar();

}
