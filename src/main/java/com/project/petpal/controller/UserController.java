package com.project.petpal.controller;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Service.UserServiceImpl;
import jakarta.validation.constraints.Null;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

@RestController("UserController")
@RequestMapping(path="/")
@CrossOrigin
public class UserController {

    @Autowired
    UserDTO userDTO;

    @Autowired
    UserServiceImpl userServiceImpl;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/memberJoin")
    public int memberJoin(@RequestBody UserDTO userDTO) {
        return userServiceImpl.memberJoin(userDTO);
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody Map<String, String> user) throws NullPointerException {
        String user_id = user.get("user_id");
        String user_pwd = user.get("user_pwd");

        logger.info("login controller");
        UserDTO userDTO1 = userServiceImpl.login(user_id, user_pwd);
        logger.info(userDTO1.toString());

        return userDTO1;
    }
}
