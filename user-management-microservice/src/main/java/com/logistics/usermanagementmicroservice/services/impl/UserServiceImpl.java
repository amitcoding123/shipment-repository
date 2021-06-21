package com.logistics.usermanagementmicroservice.services.impl;

import com.logistics.usermanagementmicroservice.domain.User;
import com.logistics.usermanagementmicroservice.repositories.UserRepository;
import com.logistics.usermanagementmicroservice.services.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User retrieveUser(String userId) {
        Optional<User> userOptional= userRepository.findByUserId(userId);
        return userOptional.isPresent() ? userOptional.get() : null;
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public List<User> getUsersByParent(User parent) {
        List<User> users = userRepository.findUserByParentId(parent);
        return users;
    }
}
