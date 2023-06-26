package com.example.crud.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PORDUCT_TBL")
public class Product {
    @Id
    @GeneratedValue // given by hibernate
    private int id; // specified the ID as the primary key
    private String name;
    private int quantity;
    private double price;
}
