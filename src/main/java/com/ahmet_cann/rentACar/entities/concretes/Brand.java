package com.ahmet_cann.rentACar.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Brand {
    @Column(name = "brandName")
    private String brandName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(mappedBy = "brand")
    private List<Model> models;

}