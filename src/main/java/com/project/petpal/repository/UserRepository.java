package com.project.petpal.repository;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
import com.project.petpal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
