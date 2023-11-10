package com.project.petpal.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@ToString
public class ContentsReplyDTO {
    private int contents_reply_num;
    private String reply_text;
}
