import models.Menu;
import models.Order;
import models.Restaurant;
import models.User;
import service.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        RestaurantService restaurantService = new RestaurantServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        // adding Users
        userService.registerUser("1", "Pralove", "M", "phoneNumber-1", "HSR");
        userService.registerUser("2", "Nitesh", "M", "phoneNumber-2", "BTM");
        userService.registerUser("3", "Vatsal", "M", "phoneNumber-3", "BTM");

        userService.loginUser("1");

        restaurantService.addNewRestaurants(new Restaurant("1", "Food Court-1", "BTM/HSR", List.of("5"), new ArrayList<>()));
        restaurantService.addNewRestaurants(new Restaurant("2", "Food Court-2", "BTM", List.of("3"), new ArrayList<>()));
        restaurantService.addNewRestaurants(new Restaurant("3", "Food Court-3", "HSR", List.of("1"), new ArrayList<>()));

        restaurantService.addNewMenu("1", new Menu("1", "Burger", "150", ""));
        restaurantService.addNewMenu("2", new Menu("2", "Vada Pav", "90", ""));
        restaurantService.addNewMenu("3", new Menu("3", "Burger", "120", ""));

        List<Restaurant> availableRestaurant = restaurantService.getAllAvailableRestaurantsForUser(userService.findById("1"));

        System.out.println("Here are the restaurants: ");
        availableRestaurant.forEach(r -> {
            System.out.println(r.getRestaurantName());
            System.out.println("Here are the menu: ");
            r.getFoodItems().forEach(m -> System.out.println(m.getFoodName() + " - " + m.getFoodPrice()));
        });

        final var placed = orderService.placeOrder(userService.findById("1"), restaurantService.findById("1"), "1");
        if(placed) {
            System.out.println("Order has been placed");
        } else {
            System.out.println("Order Placing Failed");
        }

        final var placingOrderAgain = orderService.placeOrder(userService.findById("1"), restaurantService.findById("1"), "1");
        if(placingOrderAgain) {
            System.out.println("Order has been placed");
        } else {
            System.out.println("Order Placing Failed");
        }

    }
}