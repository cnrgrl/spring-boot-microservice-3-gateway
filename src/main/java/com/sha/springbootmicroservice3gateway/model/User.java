package com.sha.springbootmicroservice3gateway.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String user;

    @Column(name = "password",  nullable = false)
    private String password;

    @Column(name = "name",  nullable = false)
    private String name;

    @Column(name = "createTime",  nullable = false)
    private LocalDateTime createTime;
}
