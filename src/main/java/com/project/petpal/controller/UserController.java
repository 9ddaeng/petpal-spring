package com.project.petpal.controller;

import com.project.petpal.DTO.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("UserController")
@RequestMapping(path="/")
@CrossOrigin
public class UserController {

    @Autowired
    UserDTO user;

    @Autowired
    UserRepo userRepo;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/memberJoin")
    public int memberJoin(@RequestBody UserDTO user) {
        int check = 0;

        logger.info("memberJoin 실행..");

        return check;

    }

}
