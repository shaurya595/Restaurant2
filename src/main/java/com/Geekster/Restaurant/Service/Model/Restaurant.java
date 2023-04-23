package com.Geekster.Restaurant.Service.Model;

import org.springframework.web.bind.annotation.RestController;


public class Restaurant {
    private String RestaurantId;

    public String getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        RestaurantId = restaurantId;
    }

    private String RestaurantName;
    private String Address;
    private String Number;
    private String Speciality;
    private int numberOfStaff;
    private String dishes;
    private int rating ;

    public Restaurant(String RestaurantId,String RestaurantName , String Address , String Number , String Speciality , int numberOfStaff , String dishes , int rating) {
        this.RestaurantId = RestaurantId;
        this.RestaurantName = RestaurantName;
        this.Address = Address;
        this.Number = Number;
        this.Speciality = Speciality;
        this.numberOfStaff = numberOfStaff;
        this.dishes = dishes;
        this.rating = rating;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        RestaurantName = restaurantName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }

    public void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
