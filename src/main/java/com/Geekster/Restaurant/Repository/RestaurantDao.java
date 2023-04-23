package com.Geekster.Restaurant.Repository;

import com.Geekster.Restaurant.Service.Model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class RestaurantDao {
    private List<Restaurant> restrolist;

    public RestaurantDao() {
        restrolist = new ArrayList<>();
        restrolist.add(new Restaurant("1","Bun Street","Kanpur","7380856175","Pizza",10,"Paneer pasta",10));
    }
    public List<Restaurant> getRestaurantFromData(){
        return restrolist;
    }
    public boolean Save (Restaurant restaurant){
        restrolist.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant restaurant){
        restrolist.remove(restaurant);
        return true;
    }
    public boolean update(String id, boolean b) {
        boolean updateStatus = false;
        for(Restaurant restaurant : restrolist){
            if (restaurant.getRestaurantId().equals(id)) {

                remove(restaurant);
                restaurant.setRestaurantId(id);
                Save(restaurant);
                return true;
            }
        }
        return false;
    }
}
