package com.ahmet_cann.rentACar.business.concretes;

import com.ahmet_cann.rentACar.business.abstracts.BrandServices;
import com.ahmet_cann.rentACar.dataAccess.abstracts.BrandRepository;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandServices {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
        public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
