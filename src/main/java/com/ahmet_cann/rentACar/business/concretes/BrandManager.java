package com.ahmet_cann.rentACar.business.concretes;

import com.ahmet_cann.rentACar.business.abstracts.BrandServices;
import com.ahmet_cann.rentACar.business.requests.CreateBrandRequest;
import com.ahmet_cann.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmet_cann.rentACar.dataAccess.abstracts.BrandRepository;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Data

public class BrandManager implements BrandServices {

    private BrandRepository brandRepository;

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setBrandId(brand.getId());
            responseItem.setBrandName(brand.getBrandName());
            brandsResponse.add(responseItem);
        }

        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setBrandName(createBrandRequest.getBrandName());
        this.brandRepository.save(brand);
    }



}
