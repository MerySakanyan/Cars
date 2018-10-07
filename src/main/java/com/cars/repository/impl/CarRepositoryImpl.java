package com.cars.repository.impl;

import com.cars.model.Car;
import com.cars.model.User;
import com.cars.repository.CarRepository;
import com.cars.repository.UserRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository
public class CarRepositoryImpl implements CarRepository {

    @Autowired
    private SessionFactory sessionFactory;




    @Override
    public Car getCarById(int id) {
        return sessionFactory.openSession().get(Car.class, id);
    }

    @Transactional
    @Override
    public void update(Car car) {
        sessionFactory.getCurrentSession().update(car);
    }

    @Override
    public List<Car> getByUser(User user) {
        return sessionFactory.getCurrentSession().get(List.class, (Serializable) user);
    }

    @Override
    public List<Car> getCar() {
        org.hibernate.query.Query query = sessionFactory.openSession().createNativeQuery("Select * From `car`").addEntity(User.class);
        return (List<Car>) query.getResultList();
    }
}
