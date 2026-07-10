package com.ahmet_cann.rentACar.webApi.controllers;

import com.ahmet_cann.rentACar.business.abstracts.BrandServices;
import com.ahmet_cann.rentACar.business.requests.CreateBrandRequest;
import com.ahmet_cann.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<GetAllBrandsResponse> getAll() {

        return brandServices.getAll();
    }

    @PostMapping("/add")
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandServices.add(createBrandRequest);
    }


}
