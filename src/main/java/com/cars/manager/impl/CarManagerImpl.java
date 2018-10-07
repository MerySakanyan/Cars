package com.cars.manager.impl;

import com.cars.manager.CarManager;
import com.cars.model.Car;
import com.cars.model.User;
import com.cars.repository.CarRepository;
import com.cars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
public class CarManagerImpl implements CarManager {
    @Autowired
    private UserRepository userRepository;

    @Autowired
     private CarRepository carRepository;


   // @Transactional
    @Override
    public void buyCar(int carId, int buyerId) {
        User buyer=  userRepository.getUserById(buyerId);

        Car car=carRepository.getCarById(carId);
        User seller=userRepository.getUserById(car.getUserId());
        seller.setAmount(seller.getAmount()+car.getPrice());
        buyer.setAmount(buyer.getAmount()-car.getPrice());
        car.setUserId(buyerId);
        carRepository.update(car);
        userRepository.update(seller);
        userRepository.update(buyer);


    }


}
