package com.ahmet_cann.rentACar.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "models")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data


public class Model {
    @Column(name = "brandName")
    private String brandName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
}
