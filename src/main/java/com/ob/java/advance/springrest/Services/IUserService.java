package com.ob.java.advance.springrest.Services;

import com.ob.java.advance.springrest.models.User;
import org.jvnet.hk2.annotations.Service;

import java.util.List;

@Service
public interface IUserService {
    public List<User> getAll();

    public User getUser(int id);

    public User save(User user);
}
