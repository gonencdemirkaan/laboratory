package com.laboratory.service.impl;

import com.laboratory.model.Laborant;
import com.laboratory.repository.LaborantRepository;
import com.laboratory.service.LaborantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaborantServiceImpl implements LaborantService {

    private final LaborantRepository laborantRepository;

    public LaborantServiceImpl(LaborantRepository laborantRepository) {
        this.laborantRepository = laborantRepository;
    }


    @Override
    public List<Laborant> getAllLaborants() {
        return laborantRepository.findAll();
    }
}
