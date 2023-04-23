package com.Geekster.Restaurant.Controller;

import com.Geekster.Restaurant.Service.Model.Restaurant;
import com.Geekster.Restaurant.Service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class RestorentController {
    @Autowired
    RestaurentService restaurentService;
    @GetMapping(value = "/getAllRestro")
    public List< Restaurant> getAllRestaurant (){
        return restaurentService.getAllRestaurant();
    }
    @PostMapping(value = "/addRestro")
    public String addRestaurant(@RequestBody Restaurant restaurant ){
        return restaurentService.addMyRestaurant(restaurant);
    }
    @RequestMapping(value = "/getById/{id}" , method = RequestMethod.GET)
    public Restaurant getRestaurantById(@PathVariable String id){
        return restaurentService.getRestaurantBasedOnId(id);
    }
    @PutMapping(value = "/update/{id}")
    public String updateRestaurantById(@PathVariable String id, @PathVariable String status){
        return restaurentService.updateById(id , status);
    }

}
