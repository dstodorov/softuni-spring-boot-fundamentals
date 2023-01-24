package com.dst.mobilele.mobilele.user.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, DatabaseInitService {

    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
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
