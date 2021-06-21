package com.logistics.usermanagementmicroservice.services;

import com.logistics.usermanagementmicroservice.domain.User;

import java.util.List;

public interface UserService {

    User retrieveUser(String userId);
    void saveUser(User user);
    List<User> getUsers();
    List<User> getUsersByParent(User parent);

}
