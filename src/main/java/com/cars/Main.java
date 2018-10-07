package com.cars;

import com.cars.manager.CarManager;
import com.cars.model.Car;
import com.cars.model.User;
import com.cars.repository.CarRepository;
import com.cars.repository.UserRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserRepository userRepositoryImpl = (UserRepository) applicationContext.getBean("userRepositoryImpl");
       // userRepositoryImpl.addUser(new User("Email","password"));

//        User user=userRepositoryImpl.getUserById(1);
//        System.out.println(user.getEmail());
//
//       CarManager carManagerImpl = (CarManager) applicationContext.getBean("carManagerImpl");
//      carManagerImpl.buyCar(1,1);

        CarRepository carRepository=(CarRepository) applicationContext.getBean("carRepositoryImpl");
        System.out.println(carRepository.getByUser(new User("anna", "2222")).get(0));
    }
}
