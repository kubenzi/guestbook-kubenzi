package com.codecool.guestbookkubenzi.Controller;

import com.codecool.guestbookkubenzi.DTO.UserDTO;
import com.codecool.guestbookkubenzi.Model.User;
import com.codecool.guestbookkubenzi.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UsersController {
    private UserService usersService;

    public UsersController(UserService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "/my-users";
    }

    @PostMapping
    public String addUser(@ModelAttribute UserDTO userDTO, Model model) {
        User user = new User(userDTO.getName(), userDTO.getAddress());
        usersService.addUser(user);
        return "redirect:users";
    }

    @GetMapping("/add")
    public String getAddUsersForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "/my-add-users";
    }

}
