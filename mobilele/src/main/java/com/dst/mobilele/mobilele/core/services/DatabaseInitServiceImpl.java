package com.dst.mobilele.mobilele.core.services;

import com.dst.mobilele.mobilele.user.services.UserRoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseInitServiceImpl implements DatabaseInitService {

    private final UserRoleService userRoleService;

    @Autowired
    public DatabaseInitServiceImpl(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    @PostConstruct
    public void postConstruct() {
        dbInit();
    }

    @Override
    public void dbInit() {
        if (!isDbInit()) {
            this.userRoleService.dbInit();
        }
    }

    @Override
    public boolean isDbInit() {
        return this.userRoleService.isDbInit();
    }
}
