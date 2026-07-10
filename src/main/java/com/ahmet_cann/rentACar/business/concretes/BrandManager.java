package com.ahmet_cann.rentACar.business.concretes;

import com.ahmet_cann.rentACar.business.abstracts.BrandServices;
import com.ahmet_cann.rentACar.business.responses.GetAllBrandsResponse;
import com.ahmet_cann.rentACar.dataAccess.abstracts.BrandRepository;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BrandManager implements BrandServices {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


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
}
