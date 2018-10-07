package com.cars.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    private int amount;


//    @OneToMany
//    @JoinColumn
//    private Car car;

    private String email;
    private String password;
    private String name;
    private String surname;
    private int verification_code;
    private int status;
    private int validation_status;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getVerification_code() {
        return verification_code;
    }

    public void setVerification_code(int verification_code) {
        this.verification_code = verification_code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getValidation_status() {
        return validation_status;
    }

    public void setValidation_status(int validation_status) {
        this.validation_status = validation_status;
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", amount=" + amount +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", verification_code=" + verification_code +
                ", status=" + status +
                ", validation_status=" + validation_status +
                '}';
    }
}
