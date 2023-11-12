package com.project.petpal.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
public class ChatDTO {
    private int chat_room_num;
}
