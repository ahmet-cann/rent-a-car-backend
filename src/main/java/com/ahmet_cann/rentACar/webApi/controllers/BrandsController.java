package com.ahmet_cann.rentACar.webApi.controllers;

import com.ahmet_cann.rentACar.business.abstracts.BrandServices;
import com.ahmet_cann.rentACar.business.requests.CreateBrandRequest;
import com.ahmet_cann.rentACar.business.requests.UpdateBrandRequest;
import com.ahmet_cann.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmet_cann.rentACar.business.responses.GetByIdBrandResponse;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
    @GetMapping()
    public List<GetAllBrandsResponse> getAll() {

        return brandServices.getAll();
    }
    @GetMapping("/{id}")
    public GetByIdBrandResponse getByIdBrand(@PathVariable int id) {
        return brandServices.getById(id);
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        this.brandServices.add(createBrandRequest);
    }

    @PutMapping()
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        this.brandServices.update(updateBrandRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        this.brandServices.delete(id);
    }



}
