package service;

import models.Menu;
import models.Order;
import models.Restaurant;
import models.User;

public interface OrderService {
    public boolean placeOrder(User user, Restaurant restaurant, String menuId);

}
