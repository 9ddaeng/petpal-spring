package com.project.petpal.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
public class BlockDTO {
    private int blocking_user_num;
    private int blocker_user_num;
}
