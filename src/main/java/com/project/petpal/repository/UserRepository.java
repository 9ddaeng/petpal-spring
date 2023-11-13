package com.project.petpal.repository;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    @Query("SELECT u FROM UserEntity u WHERE u.user_id = :user_id AND u.user_pwd = :user_pwd")
    UserEntity findByStringId(@Param("user_id") String user_id, @Param("user_pwd") String user_pwd);

}
