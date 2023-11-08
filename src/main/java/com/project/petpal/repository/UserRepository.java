package com.project.petpal.repository;

import com.project.petpal.DTO.UserDTO;
import com.project.petpal.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    @Override
    default <S extends UserEntity> S saveAndFlush(S entity) {
        return null;
    }
}
