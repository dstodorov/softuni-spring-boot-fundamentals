package com.dst.mobilele.mobilele.offer.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.offer.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService, DatabaseInitService {
    private final OfferRepository repository;

    @Autowired
    public OfferServiceImpl(OfferRepository repository) {
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
