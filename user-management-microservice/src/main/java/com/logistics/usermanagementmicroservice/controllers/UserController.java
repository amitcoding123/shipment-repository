package com.logistics.usermanagementmicroservice.controllers;

import com.logistics.domain.UserDto;
import com.logistics.usermanagementmicroservice.convertors.UserConvertor;
import com.logistics.usermanagementmicroservice.domain.User;
import com.logistics.usermanagementmicroservice.domain.UserList;
import com.logistics.usermanagementmicroservice.exception.PasswordIncorrectException;
import com.logistics.usermanagementmicroservice.exception.UserNotFoundException;
import com.logistics.usermanagementmicroservice.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

//    @PostMapping("/user/authenticate")
//    public User authenticateUser(@RequestBody User user) {
//        System.out.println("In the user controller. UserId = " + user.getUserId());
//        User user1 = userService.retrieveUser(user.getUserId());
//        System.out.println("In the user controller. Retrieved User = " + user);
//        if(user1 == null)
//            throw new UserNotFoundException("User ID = " + user.getUserId());
//        if(!user1.getPassword().equals(user.getPassLocal()))
//            throw new PasswordIncorrectException("Incorrect Password!!!");
//        return user1;
//    }

    @PostMapping("/user/authenticate")
    public UserDto authenticateUser(@RequestBody UserDto user) {
        System.out.println("In the user controller. UserId = " + user.getUserId());
        User user1 = userService.retrieveUser(user.getUserId());
        System.out.println("In the user controller. Retrieved User = " + user);
        if(user1 == null)
            throw new UserNotFoundException("User ID = " + user.getUserId());
        if(!user1.getPassword().equals(user.getPassLocal()))
            throw new PasswordIncorrectException("Incorrect Password!!!");
        return UserConvertor.getInstance().convert(user1);
    }

    @PostMapping("/saveNewPassword")
    public void saveNewPassword(@RequestBody UserDto user) {
        User user1 = userService.retrieveUser(user.getUserId());
        user1.setPassword(user.getPassLocal());
        userService.saveUser(user1);
    }

//    @GetMapping("/users")
//    public List<User> getUsers() {
//        List<User> users = userService.getUsers();
//        return users;
//    }

    @GetMapping("/users")
    public List<UserDto> getUsers() {
        List<UserDto> users = UserConvertor.getInstance().convertList(userService.getUsers());
        return users;
    }

    @GetMapping("/users/{userId}")
    public List<User> getManagedUsers(@PathVariable String userId) {
        User user = userService.retrieveUser(userId);
        List<User> users = userService.getUsersByParent(user);
        return users;
    }

}
