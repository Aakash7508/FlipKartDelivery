package service;

import models.*;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    List<Order> orders = new ArrayList<>();
    @Override
    public boolean placeOrder(User user, Restaurant restaurant, String menuId) {
        final Menu menu = restaurant.getFoodItems().stream().filter(r -> r.getId().equals(menuId)).findFirst().get();
        final var order = new Order(user.getId(), restaurant.getId(), menu.getId());
        if(user.getOrders().stream().noneMatch(r -> r.getOrderStatus().equals(OrderStatus.PLACED)))  {
            user.getOrders().add(order);
            orders.add(order);
            return true;
        } else {
            return false;
        }
    }
}
