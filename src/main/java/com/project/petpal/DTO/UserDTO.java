package com.project.petpal.DTO;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDateTime;

@Component("UserDTO")
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private int user_num;
    private String user_id;
    private String user_pwd;
    private String user_nick;
    private String user_address;
    private LocalDateTime user_join_date;
    private String user_name;
    private String user_phone;

}
