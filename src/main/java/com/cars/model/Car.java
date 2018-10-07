package com.cars.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Car implements Serializable
 {

    @Id
    @GeneratedValue
    private  int id;

    private String model;

    private int price;


     private int userId;

//    @ManyToMany
//    @JoinColumn
//    private  User user;

    public int getId() {
        return id;
    }
//
    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

     public int getUserId() {
         return userId;
     }

     public void setUserId(int userId) {
         this.userId = userId;
     }
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "id=" + id +
//                ", model='" + model + '\'' +
//                ", price=" + price +
//                ", user=" + user +
//                '}';
//    }
}
