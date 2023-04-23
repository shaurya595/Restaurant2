package com.Geekster.Restaurant.Service;

import com.Geekster.Restaurant.Repository.RestaurantDao;
import com.Geekster.Restaurant.Service.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RestaurentService {

        @Autowired
        RestaurantDao restaurantDao;

        public List<Restaurant> getAllRestaurant() {
            return restaurantDao.getRestaurantFromData();
        }
        public String addMyRestaurant( Restaurant restaurant){
            boolean saveOrNot = restaurantDao.Save(restaurant);
            if(saveOrNot){
                return "save Successfully";
            }else{
                return "not Saved";
            }

        }
    public Restaurant getRestaurantBasedOnId(String id) {
        List<Restaurant> RestaurantRightNow = restaurantDao.getRestaurantFromData();
        for (Restaurant restaurant : RestaurantRightNow) {
            if (restaurant.getRestaurantId().equals(id)) {
                return restaurant;
            }
        }
        return null;


    }
    public String updateById(String id, String status){
        boolean updateStatus = restaurantDao.update(id,Boolean.parseBoolean(status));
        if(updateStatus){
            return "User with Id"+id+" was Updated";
        }else{
            return "User with Id "+id+ "Not Updated";
        }

    }

    }
