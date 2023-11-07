package com.project.petpal.service;

import com.project.petpal.DTO.UserDTO;
import org.springframework.stereotype.Service;

@Service("UserService")
public interface UserService {

    public int memberJoin(UserDTO user);
}
