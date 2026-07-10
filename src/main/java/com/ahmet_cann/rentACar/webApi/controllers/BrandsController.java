package com.ahmet_cann.rentACar.webApi.controllers;

import com.ahmet_cann.rentACar.business.abstracts.BrandServices;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandServices brandServices;

    @Autowired
    public BrandsController(BrandServices brandServices) {

        this.brandServices = brandServices;
    }
    @GetMapping("/getAll")
    public List<Brand> getAll() {

        return brandServices.getAll();
    }

}
