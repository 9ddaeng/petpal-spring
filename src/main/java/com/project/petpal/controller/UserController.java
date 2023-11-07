package com.project.petpal.controller;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Service.UserService;
import org.apache.catalina.connector.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.project.petpal.repository.UserRepository;

import java.util.Map;

@RestController("UserController")
@RequestMapping(path="/")
@CrossOrigin
public class UserController {

    @Autowired
    UserDTO userDTO;

    @Autowired
    UserRepository userRepo;

    @Autowired
    UserService userService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/memberJoin")
    public UserDTO memberJoin(@RequestBody UserDTO userDTO) {

        logger.info("user_name="+userDTO.getUser_name());

        //userService.memberJoin(user);

        return userDTO;

    }

}
