package com.ob.java.advance.springrest.controllers;

import com.ob.java.advance.springrest.Services.IUserService;
import com.ob.java.advance.springrest.models.User;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/api/v1")
public class UserController {

    private IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GET
    @Path("/users")
    @Produces("application/json")
    public List<User> users() {
        return userService.getAll();
    }

    @GET
    @Path("/users/{id}")
    @Produces("application/json")
    public User user(@PathParam("id") int id) {
        return userService.getUser(id);
    }

    @POST
    @Path("/users")
    @Produces("application/json")
    @Consumes("application/json")
    public Response save(User user) {
        userService.save(user);
        return Response
                .created(URI.create("/users/" + user.getId()))
                .build();
    }
}

