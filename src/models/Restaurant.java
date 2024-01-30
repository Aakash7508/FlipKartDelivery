package models;


import java.util.List;

public class Restaurant {
      private String id;
      private String restaurantName;
      private String restaurantLocation;
      private List<String> locations;
      private List<Menu> foodItems;

      public Restaurant(String id, String restaurantName, String restaurantLocation, List<String> locations, List<Menu> foodItems) {
            this.id = id;
            this.restaurantName = restaurantName;
            this.restaurantLocation = restaurantLocation;
            this.locations = locations;
            this.foodItems = foodItems;
      }

      public String getId() {
            return id;
      }

      public void setId(String id) {
            this.id = id;
      }

      public String getName() {
            return restaurantName;
      }

      public void setName(String name) {
            this.restaurantName = name;
      }

      public List<String> getLocations() {
            return locations;
      }

      public void setLocations(List<String> locations) {
            this.locations = locations;
      }

      public String getRestaurantName() {
            return restaurantName;
      }

      public void setRestaurantName(String restaurantName) {
            this.restaurantName = restaurantName;
      }

      public String getRestaurantLocation() {
            return restaurantLocation;
      }

      public void setRestaurantLocation(String restaurantLocation) {
            this.restaurantLocation = restaurantLocation;
      }

      public List<Menu> getFoodItems() {
            return foodItems;
      }

      public void setFoodItems(List<Menu> foodItems) {
            this.foodItems = foodItems;
      }
}
