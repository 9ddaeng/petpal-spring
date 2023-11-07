package com.project.petpal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Table(name = "contentsReply")
@Entity
@Getter
@NoArgsConstructor
public class ContentsReplyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contents_reply_num;

    @Column(length = 300, nullable = false)
    private String reply_text;
}
