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

    @Query("SELECT COUNT(u.user_name) FROM UserEntity u WHERE u.user_name = :user_name")
    int valUserName(@Param("user_name") String user_name);

    @Query("SELECT COUNT(u.user_nick) FROM UserEntity u WHERE u.user_name = :user_nick")
    int valUserNick(@Param("user_nick") String user_nick);

    @Query("SELECT COUNT(u.user_num) FROM UserEntity u WHERE u.user_id = :user_id AND u.user_pwd = :user_pwd")
    int valUserIdPwd(@Param("user_id") String user_id, @Param("user_pwd") String user_pwd);

}
