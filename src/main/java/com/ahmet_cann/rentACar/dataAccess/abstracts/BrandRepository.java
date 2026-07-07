package com.ahmet_cann.rentACar.dataAccess.abstracts;

import com.ahmet_cann.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();


}
