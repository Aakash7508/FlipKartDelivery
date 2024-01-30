package service;

import models.User;

public interface UserService {
    public void registerUser(String id, String name, String gender, String phoneNumber, String address);
    public void loginUser(String user);

    User findById(String id);
}
