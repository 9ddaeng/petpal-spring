package com.project.petpal.DTO;

import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@NoArgsConstructor
@ToString
public class PetDTO {
    private int pet_num;
    private String pet_name;
    private int pet_age;
    private int pet_gender;
    private Date pet_birth;
    private int pet_illness;
    private int pet_weight;
    private int pet_spaying;
    private int pet_species;
}
