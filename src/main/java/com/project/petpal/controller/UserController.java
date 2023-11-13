package com.project.petpal.controller;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
import com.project.petpal.Service.UserServiceImpl;
import com.project.petpal.repository.UserRepository;
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

    @Autowired
    UserRepository userRepo;

    private final static Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/validateJoinUser")
    public int validateJoinUser(@RequestBody UserDTO userDTO) {

        logger.info("UserController의 validateJoinUser실행");
        // 가입하기 전에 기존에 등록된 이름, 아이디, 비밀번호, 닉네임인지 확인한다.
        // 동일한 이름으로 아이디는 3개까지만 만들 수 있다.
        String user_name = userDTO.getUser_name();
        int valUserName = userServiceImpl.valUserName(user_name);

        // 아이디-비밀번호는 똑같은 쌍을 가진 값을 가질수 없다.
        String user_id = userDTO.getUser_id();
        String user_pwd = userDTO.getUser_pwd();
        int valUserIdPwd = userServiceImpl.valUserIdPwd(user_id, user_pwd);

        //닉네임은 중복될 수 없다.
        String user_nick = userDTO.getUser_nick();
        int valUserNick = userServiceImpl.valUserNick(user_nick);

        //해당 정보로 가입이 불가능 할 경우에는 0을 리턴해준다.
        if (valUserName >= 4 || valUserIdPwd>=1 || valUserNick >=1) {
            return 0;
        } else {
            return 1;
        }

    }
    @PostMapping("/memberJoin")
    public int memberJoin(@RequestBody UserDTO userDTO) {
        logger.info("*********UserController의 memberJoin실행*******");
        return userServiceImpl.memberJoin(userDTO);
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody Map<String, String> user) throws NullPointerException {
        String user_id = user.get("user_id");
        String user_pwd = user.get("user_pwd");

        logger.info("UserController의 login실행");
        UserDTO userDTO1 = userServiceImpl.login(user_id, user_pwd);
        logger.info(userDTO1.toString());

        return userDTO1;
    }
}
