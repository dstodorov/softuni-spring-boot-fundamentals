package com.dst.mobilele.mobilele.brand.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DatabaseInitService {

    private final UserRepository repository;


    @Autowired
    public BrandServiceImpl(UserRepository repository) {
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
