package com.logistics.usermanagementmicroservice.convertors;

import com.logistics.domain.UserDto;
import com.logistics.usermanagementmicroservice.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserConvertor {

    private static UserConvertor instance;

    private UserConvertor() {
    }

    public static UserConvertor getInstance() {
        if(instance == null)
            instance = new UserConvertor();
        return instance;
    }

    public UserDto convert(User user) {
        UserDto dto = new UserDto();

        dto.setId(user.getId());
        dto.setCreatedBy(user.getCreatedBy());
        dto.setCreatedOn(user.getCreatedOn());
        dto.setModifiedBy(user.getModifiedBy());
        dto.setModifiedOn(user.getModifiedOn());
        dto.setCountryCode(user.getCountryCode());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setLastName(user.getLastName());
        dto.setMobileNumber(user.getMobileNumber());
        dto.setRole(user.getRole());
        dto.setUserId(user.getUserId());

        return dto;
    }

    public List<UserDto> convertList(List<User> users)
    {
        List<UserDto> userDtos = new ArrayList<>(1);

        for (User user: users) {
            userDtos.add(convert(user));
        }

        return userDtos;
    }

}
