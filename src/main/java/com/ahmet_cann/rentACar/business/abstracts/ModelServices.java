package com.ahmet_cann.rentACar.business.abstracts;

import com.ahmet_cann.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelServices {
    List<GetAllModelsResponse> getAll();
}
