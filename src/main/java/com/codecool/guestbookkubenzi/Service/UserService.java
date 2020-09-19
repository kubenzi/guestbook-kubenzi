package com.codecool.guestbookkubenzi.Service;

import com.codecool.guestbookkubenzi.DAO.UserDAO;
import com.codecool.guestbookkubenzi.Model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO){
        this.userDAO = userDAO;
    }

    public List<User> getAllUsers(){
        return userDAO.getUsers();
    }

    public Optional<User> getUser(int ID){
        return userDAO.getUsers().stream()
                .filter(user -> user.getID() == ID)
                .findFirst();
    }

    public void addUser(User user){
        userDAO.addUser(user);
    }

}
