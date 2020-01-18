package com.apprentices.KeepMeAlive.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID")
    private Integer id;

    @Column(name = "userLoginName")
    private String username;
    @Column(name = "userFirstName")
    private String firstName;
    @Column(name= "userLastName")
    private String lastName;
    @Column(name = "userEmailAddress")
    private String emailAddress;
    private boolean active;
}
