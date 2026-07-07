package com.ahmet_cann.rentACar.dataAccess.concretes;

import com.ahmet_cann.rentACar.dataAccess.abstracts.BrandRepository;
import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class inMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;
    public inMemoryBrandRepository() {

        brands = new ArrayList<Brand>();
        brands.add(new Brand("BMW",1));
        brands.add(new Brand("MERCEDES",2));
        brands.add(new Brand("HONDA",3));
        brands.add(new Brand("PORSCHE",4));
        brands.add(new Brand("TOYOTA",5));
        brands.add(new Brand("FERRARI",6));
        brands.add(new Brand("JAGUAR",7));
        brands.add(new Brand("AUDI",8));
    }


    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
