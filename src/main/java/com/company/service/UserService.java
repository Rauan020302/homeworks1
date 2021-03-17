package com.company.service;

import com.company.dao.UserDao;
import com.company.model.User;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/user")
public class UserService {
    private UserDao userDao = new UserDao();
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<User> getUser(){
        return userDao.getUser();
    }

}