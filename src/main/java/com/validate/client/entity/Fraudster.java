package com.validate.client.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fraudsters")
public class Fraudsters {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client")
    private String client;

}
