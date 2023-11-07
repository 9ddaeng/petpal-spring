package com.project.petpal.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("BlockDTO")
@Getter
@Setter
public class BlockDTO {
    private int blocking_user_num;
    private int blocker_user_num;
}
