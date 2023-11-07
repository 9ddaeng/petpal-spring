package com.project.petpal.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("NoticeDTO")
@Getter
@Setter
public class NoticeDTO {
    private int notice_num;
    private int notice_type;
    private String notice_context;
}
