package com.project.petpal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Getter
@Table(name = "follow")
@NoArgsConstructor
public class FollowEntity {

    private int folower_user_num;
    private int folling_user_num;
}
