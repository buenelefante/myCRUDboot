package com.valdemiro.mycrudboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String address;
}
