package com.ahmet_cann.rentACar.business.concretes;

import com.ahmet_cann.rentACar.business.abstracts.ModelServices;
import com.ahmet_cann.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ModelManager implements ModelServices {
    private
    @Override
    public List<GetAllModelsResponse> getAll() {
        return null;
    }
}
