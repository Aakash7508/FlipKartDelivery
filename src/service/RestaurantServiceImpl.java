package service;

import models.Menu;
import models.Restaurant;
import models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantServiceImpl implements RestaurantService {
    public Map<String, Restaurant> restaurants = new HashMap<>();
    public List<Menu> menuList = new ArrayList<>();

    @Override
    public Restaurant findById(String id) {
        return restaurants.get(id);
    }

    @Override
    public void addNewRestaurants(Restaurant restaurant) {
        if(!restaurants.containsKey(restaurant.getId())) {
            restaurants.put(restaurant.getId(), restaurant);
        }
    }

    @Override
    public List<Restaurant> getAllAvailableRestaurantsForUser(User user) {
        List<Restaurant> availableRestaurant = new ArrayList<>();
        restaurants.values().forEach(r -> {
            if(r.getLocations().contains(user.getPinCode()))
                availableRestaurant.add(r);
        });
        return availableRestaurant;
    }

    @Override
    public void addNewMenu(String restaurantId, Menu menu) {
        restaurants.get(restaurantId).getFoodItems().add(menu);
        menuList.add(menu);
    }

    @Override
    public void updateExistingMenu(Menu menu) {

    }
}
