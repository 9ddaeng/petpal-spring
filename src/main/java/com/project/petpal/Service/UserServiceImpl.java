package com.project.petpal.Service;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
import com.project.petpal.repository.UserRepository;
import jakarta.validation.constraints.Null;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.xml.ExceptionElementParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDTO userDTO;

    @Autowired
    UserRepository userRepo;

    @Override
    public int memberJoin(UserDTO user) {
        UserEntity entity = toEntity(user);
        userRepo.save(entity);
        return entity.getUser_num();
    }

    @Override
    public UserDTO login(String user_id, String user_pwd) throws NullPointerException {
        UserEntity userEntity = userRepo.findByStringId(user_id, user_pwd);

        try {
            return UserDTO.toDTO(userEntity);
        } catch (Exception e) {
            e.printStackTrace();
            userDTO.setUser_num(0);
            return userDTO;
        }

    }

    @Override
    public int valUserName(String user_name) {
        return userRepo.valUserName(user_name);
    }

    @Override
    public int valUserNick(String user_nick) {
        return userRepo.valUserNick(user_nick);
    }

    @Override
    public int valUserIdPwd(String user_id, String user_pwd) {
        return userRepo.valUserIdPwd(user_id, user_pwd);
    }

}
