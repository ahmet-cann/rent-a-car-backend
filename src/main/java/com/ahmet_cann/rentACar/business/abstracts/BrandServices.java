package com.ahmet_cann.rentACar.business.abstracts;

import com.ahmet_cann.rentACar.business.requests.CreateBrandRequest;
import com.ahmet_cann.rentACar.business.requests.UpdateBrandRequest;
import com.ahmet_cann.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmet_cann.rentACar.business.responses.GetByIdBrandResponse;
import com.ahmet_cann.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandServices {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}
