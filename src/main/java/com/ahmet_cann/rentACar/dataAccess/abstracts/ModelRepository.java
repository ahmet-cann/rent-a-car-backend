package com.ahmet_cann.rentACar.dataAccess.abstracts;

import com.ahmet_cann.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model, Integer> {


}
