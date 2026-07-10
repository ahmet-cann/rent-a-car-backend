package com.ahmet_cann.rentACar.business.abstracts;

import com.ahmet_cann.rentACar.business.requests.CreateBrandRequest;
import com.ahmet_cann.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmet_cann.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandServices {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);

}
