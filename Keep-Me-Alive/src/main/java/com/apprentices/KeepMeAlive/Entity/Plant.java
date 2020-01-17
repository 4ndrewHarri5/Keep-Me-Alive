package com.apprentices.KeepMeAlive.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Plants")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int waterFrequencyInDays;

}
