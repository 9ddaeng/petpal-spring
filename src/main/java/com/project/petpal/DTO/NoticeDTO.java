package com.project.petpal.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
public class NoticeDTO {
    private int notice_num;
    private int notice_type;
    private String notice_context;
}
