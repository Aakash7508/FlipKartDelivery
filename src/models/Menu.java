package models;

public class Menu {
    private String id;
    String foodName;
    String foodPrice;
    String foodQuantity;

    public Menu(String id, String foodName, String foodPrice, String foodQuantity) {
        this.id = id;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.foodQuantity = foodQuantity;
    }

    public String getId() {
        return id;
    }


    public String getFoodName() {
        return foodName;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public String getFoodQuantity() {
        return foodQuantity;
    }
}
