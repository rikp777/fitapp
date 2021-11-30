package com.fitapp.main.dto.mapper;

import com.fitapp.main.dto.model.RoleDto;
import com.fitapp.main.dto.model.UserDto;
import com.fitapp.main.model.User;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto()
                .setEmailAddress(user.getEmailAddress())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setPhoneNumber(user.getPhoneNumber());
    }
}
