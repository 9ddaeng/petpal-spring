package com.project.petpal.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("FollowDTO")
@Getter
@Setter
public class FollowDTO {
    private int folower_user_num;
    private int folling_user_num;
}
