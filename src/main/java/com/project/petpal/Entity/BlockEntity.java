package com.project.petpal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
@Entity
@Getter
@Table(name = "block")
@NoArgsConstructor
public class BlockEntity {

    private int blocking_user_num;
    private int blocker_user_num;
}
