package com.project.petpal.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Component("ContentsDTO")
@Getter
@Setter
public class ContentsDTO {
    private int contents_num;
    private Date contents_date;
    private String contents_text;
    private int contets_like;
    private int contents_reply_count;
}
