package com.project.petpal.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
public class FollowDTO {
    private int folower_user_num;
    private int folling_user_num;
}
