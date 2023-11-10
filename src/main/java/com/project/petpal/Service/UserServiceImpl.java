package com.project.petpal.Service;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
import com.project.petpal.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDTO userDTO;

    @Autowired
    UserRepository userRepo;

    public int memberJoin(UserDTO user) {

        UserEntity entity = toEntity(user);
        userRepo.save(entity);

        logger.info("userService 실행");

        return entity.getUser_num();
    }



}
