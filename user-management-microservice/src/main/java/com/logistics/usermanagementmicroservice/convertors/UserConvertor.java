package com.logistics.usermanagementmicroservice.convertors;

import java.util.ArrayList;
import java.util.List;

import com.logistics.domain.BankDetailsDto;
import com.logistics.domain.OrganizationDto;
import com.logistics.domain.UserDto;
import com.logistics.usermanagementmicroservice.domain.BankDetails;
import com.logistics.usermanagementmicroservice.domain.User;

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
        
        OrganizationDto organization = new OrganizationDto();
        organization.setId(user.getOrganization().getId());
        organization.setEmail(user.getOrganization().getEmail());
        organization.setGstin(user.getOrganization().getGstin());
        organization.setName(user.getOrganization().getName());
        organization.setTelephoneNumber(user.getOrganization().getTelephoneNumber());
        organization.setAddress(user.getOrganization().getAddress());
        
        List<BankDetailsDto> bankDetails = new ArrayList<>(1);
        
        for(BankDetails bankDetailsL: user.getOrganization().getBankDetails()) {
        	BankDetailsDto detailsDto = new BankDetailsDto();
        	detailsDto.setId(bankDetailsL.getId());
        	detailsDto.setAccountNumber(bankDetailsL.getAccountNumber());
        	detailsDto.setBankName(bankDetailsL.getBankName());
        	detailsDto.setIfscCode(bankDetailsL.getIfscCode());
        	detailsDto.setMicrCode(bankDetailsL.getMicrCode());
        	bankDetails.add(detailsDto);
        }
        
        organization.setBankDetails(bankDetails);
        
        dto.setOrganization(organization);

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
