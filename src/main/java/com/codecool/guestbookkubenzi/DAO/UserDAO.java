package com.codecool.guestbookkubenzi.DAO;

import com.codecool.guestbookkubenzi.Model.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    void addUser(User user);
}
