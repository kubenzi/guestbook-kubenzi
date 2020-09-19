package com.codecool.guestbookkubenzi.DTO;

import com.codecool.guestbookkubenzi.Model.User;

import java.util.ArrayList;
import java.util.List;

public class UserCreatDTO {

    private List<User> users;

    public UserCreatDTO(){
        this.users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getUsers(){
        return users;
    }

    public void setUsers(List<User> users){
        this.users = users;
    }
}
