package com.project.petpal.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component("UserDTO")
@Getter
@Setter
public class UserDTO {
    private int user_num;
    private String user_id;
    private String user_pwd;
    private String user_nick;
    private String user_address;
    private Date user_join_date;
    private String user_name;
    private String user_phone;
}
