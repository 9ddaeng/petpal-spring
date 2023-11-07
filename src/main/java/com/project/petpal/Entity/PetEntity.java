package com.project.petpal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.sql.Date;

@Entity
@Getter
@Table(name = "pet")
@NoArgsConstructor
public class PetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pet_num;

    @Column(length = 10, nullable = false)
    private String pet_name;

    @Column(nullable = false)
    private int pet_age;

    @Column(nullable = false)
    private int pet_gender;

    @Column(nullable = false)
    private Date pet_birth;

    @Column(nullable = false)
    private int pet_illness;

    @Column(nullable = false)
    private int pet_weight;

    @Column(nullable = false)
    private int pet_spaying;

    @Column(nullable = false)
    private int pet_species;
}
