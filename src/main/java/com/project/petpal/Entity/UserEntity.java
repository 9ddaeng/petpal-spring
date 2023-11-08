package com.project.petpal.Entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "user")
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_num;

    @Column(length = 20, nullable = false)
    private String user_id;

    @Column(length = 20, nullable = false)
    private String user_pwd;

    @Column(length = 10, nullable = false)
    private String user_nick;

    @Column(length = 50)
    private String user_address;

    @CreationTimestamp
    private LocalDateTime user_join_date;

    @Column(length = 10, nullable = false)
    private String user_name;

    @Column(length = 20, nullable = false)
    private String user_phone;
}
