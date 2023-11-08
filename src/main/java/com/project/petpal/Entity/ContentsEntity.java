package com.project.petpal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.sql.Date;


@Getter
@Entity
@Table(name = "contents")
@NoArgsConstructor
public class ContentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contents_num;

    private Date contents_date;

    @Column(length = 500, nullable = false)
    private String contents_text;

    private int contets_like;
    private int contents_reply_count;
}
