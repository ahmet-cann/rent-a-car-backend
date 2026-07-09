package com.ahmet_cann.rentACar.dataAccess.abstracts;

import com.ahmet_cann.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {


}
