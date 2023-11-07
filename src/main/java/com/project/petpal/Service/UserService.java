package com.project.petpal.Service;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    UserDTO userDTO;

    public UserDTO memberJoin(UserDTO user) {

        userDTO.toEntity();

        return userDTO;
    }



}
