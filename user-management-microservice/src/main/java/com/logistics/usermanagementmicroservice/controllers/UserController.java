package com.logistics.usermanagementmicroservice.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.domain.UserDto;
import com.logistics.usermanagementmicroservice.convertors.UserConvertor;
import com.logistics.usermanagementmicroservice.domain.User;
import com.logistics.usermanagementmicroservice.exception.PasswordIncorrectException;
import com.logistics.usermanagementmicroservice.exception.UserNotFoundException;
import com.logistics.usermanagementmicroservice.services.UserService;
import com.logistics.usermanagementmicroservice.util.PasswordManager;

@RestController
public class UserController {

    private UserService userService;
    private PasswordManager passwordManager;


    public UserController(UserService userService) {
        this.userService = userService;
        this.passwordManager = new PasswordManager();
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
        System.out.println("Password Manager = " + passwordManager);
        if(!passwordManager.comparePassword(user1.getPassword(), user.getPassLocal()))
            throw new PasswordIncorrectException("Incorrect Password!!!");
        System.out.println("Authenticated the user");        
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
    
    @GetMapping("/user/{userId}")
    public UserDto getUser(@PathVariable String userId) {
    	UserDto user = UserConvertor.getInstance().convert(userService.retrieveUser(userId));
    	return user;
    }

}
