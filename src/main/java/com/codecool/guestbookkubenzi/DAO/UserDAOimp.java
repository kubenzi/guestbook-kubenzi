package com.codecool.guestbookkubenzi.DAO;

import com.codecool.guestbookkubenzi.Model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class UserDAOimp implements UserDAO{
    private final List<User> users = Stream.of(
            new User(1, "Jakub Chorążyk", "ul. Nad Potokiem 9/4, 30-830 Kraków"),
            new User(2, "Łucja Wojciechowska", "ul. Nowy Świat 98, 32-020 Strumiany"))
            .collect(Collectors.toList());

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
