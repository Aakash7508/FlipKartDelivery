package service;

import models.Menu;
import models.Order;
import models.Restaurant;
import models.User;

import java.util.HashMap;
import java.util.Map;

public class UserServiceImpl implements UserService {
    public Map<String, User> users = new HashMap<>();
    @Override
    public void registerUser(String id, String name, String gender, String phoneNumber, String address) {
        final User user = new User(id, gender, phoneNumber, address, "1");
        users.put(id, user);
    }

    @Override
    public void loginUser(String user) {
        users.get(user).setLoggedIn(true);
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }
}
