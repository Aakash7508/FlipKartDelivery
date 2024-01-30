package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    // Could be enum
    private String gender;
    private String phoneNumber;
    private String pinCode;
    private List<Order> orders;
    private Boolean loggedIn;

    public User(String id, String name, String gender, String phoneNumber, String pinCode) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.pinCode = pinCode;
        this.phoneNumber = phoneNumber;
        this.loggedIn = false;
        this.orders = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
}
