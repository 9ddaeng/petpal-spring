package com.project.petpal.controller;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Service.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("UserController")
@RequestMapping(path="/")
@CrossOrigin
public class UserController {

    @Autowired
    UserDTO userDTO;

    @Autowired
    UserServiceImpl userService;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/memberJoin")
    public int memberJoin(@RequestBody UserDTO userDTO) {
        int user_num = 0;
        logger.info("user_name="+userDTO.getUser_name());
        user_num = userService.memberJoin(userDTO);

        return user_num;
    }
}
