package com.apprentices.KeepMeAlive.entity;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "plantID")
    private Integer id;

    @Column(name = "plantName")
    private String name;
    @Column(name = "waterFrequency")
    private Integer waterFrequencyInDays;

}
