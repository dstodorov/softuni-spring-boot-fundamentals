package com.dst.mobilele.mobilele.model.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.model.repository.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ModelServiceImpl implements ModelService, DatabaseInitService {

    private final ModelRepository repository;

    @Autowired
    public ModelServiceImpl(ModelRepository repository) {
        this.repository = repository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.repository.count() > 0;
    }
}
