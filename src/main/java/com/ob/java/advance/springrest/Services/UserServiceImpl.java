package com.ob.java.advance.springrest.Services;

import com.ob.java.advance.springrest.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceImpl implements IUserService {

    private List<User> users = new ArrayList<>();

    public List<User> getAll() {
        return users;
    }

    public User getUser(int id) {
        for (User user : users)
            if (user.getId() == id) return user;
        return new User(0, "Not Found", "Not Found");
    }

    public User save(User user) {
        User create = new User(user.getId(), user.getName(), user.getLastname());
        users.add(create);
        return create;
    }
}
