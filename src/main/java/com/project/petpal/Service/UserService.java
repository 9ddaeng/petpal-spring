package com.project.petpal.Service;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
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

    @Autowired
    UserRepository userRepository;

    public int memberJoin(UserDTO userDTO) throws Exception {

        int check = 0;

//        UserEntity user = userRepository.save(UserEntity.builder().
//                user_name("김제니").
//                user_pwd("jennie12").
//                user_id("jennie").
//                user_nick("제니").
//                user_phone("01033333").build());

        logger.info("userService 실행");

        return check;
    }



}
