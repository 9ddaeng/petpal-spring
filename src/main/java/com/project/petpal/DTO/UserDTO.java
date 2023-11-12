package com.project.petpal.DTO;

import com.project.petpal.Entity.UserEntity;
import lombok.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component("UserDTO")
public class UserDTO {

    private int user_num;
    private String user_id;
    private String user_pwd;
    private String user_nick;
    private String user_address;
    private LocalDateTime user_join_date;
    private String user_name;
    private String user_phone;

    @Builder
    public UserDTO(int user_num, String user_id, String user_pwd, String user_nick, String user_address,
                   String user_name, String user_phone, LocalDateTime user_join_date) {

        this.user_num = user_num;
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_nick = user_nick;
        this.user_address = user_address;
        this.user_name = user_name;
        this.user_phone = user_phone;
        this.user_join_date = user_join_date;
    }

}
