package service;

import models.Menu;
import models.Restaurant;
import models.User;

import java.util.List;

public interface RestaurantService {
    public Restaurant findById(String id);
    public void addNewRestaurants(Restaurant restaurant);
    public List<Restaurant> getAllAvailableRestaurantsForUser(User user);
    public void addNewMenu(String restaurantId, Menu menu);

    public void updateExistingMenu(Menu menu);
}
