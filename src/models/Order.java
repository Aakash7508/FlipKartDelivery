package models;

import java.time.LocalDateTime;

public class Order {
    private String restaurantId;
    private String foodId;
    private LocalDateTime placedAt;
    private OrderStatus orderStatus;


    public Order(String userId, String restaurantId, String foodId) {
        this.restaurantId = restaurantId;
        this.foodId = foodId;
        this.placedAt = LocalDateTime.now();
        this.orderStatus = OrderStatus.PLACED;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public LocalDateTime getPlacedAt() {
        return placedAt;
    }

    public void setPlacedAt(LocalDateTime placedAt) {
        this.placedAt = placedAt;
    }
}
