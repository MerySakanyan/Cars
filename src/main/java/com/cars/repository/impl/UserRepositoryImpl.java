package com.cars.repository.impl;


import com.cars.model.User;
import com.cars.repository.UserRepository;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void addUser(User user) {

        sessionFactory.getCurrentSession().save(user);

    }


    @Override
    public User getUser(String email) {
        org.hibernate.query.Query query = sessionFactory.openSession().createNativeQuery("Select * From `user` where email = :email").addEntity(User.class);
        query.setParameter("email", email);
        return (User) query.uniqueResult();
    }

    @Override
    public User getUserById(int id) {
        return sessionFactory.openSession().get(User.class, id);
    }

    @Transactional
    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

}
