package com.project.petpal.Service;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public interface UserService {

    public int memberJoin(UserDTO user);

//    public UserDTO login(String user_id, String user_pwd);


    default UserEntity toEntity(UserDTO user) {
        UserEntity entity = UserEntity.builder()
                .user_id(user.getUser_id())
                .user_pwd(user.getUser_pwd())
                .user_nick(user.getUser_nick())
                .user_name(user.getUser_name())
                .user_address(user.getUser_address())
                .user_phone(user.getUser_phone())
                .build();

        return entity;
    }
}
