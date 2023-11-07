package com.example.examp.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private double wage;


}
