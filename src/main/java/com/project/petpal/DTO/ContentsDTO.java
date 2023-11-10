package com.project.petpal.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@NoArgsConstructor
@ToString
public class ContentsDTO {
    private int contents_num;
    private Date contents_date;
    private String contents_text;
    private int contets_like;
    private int contents_reply_count;
}
