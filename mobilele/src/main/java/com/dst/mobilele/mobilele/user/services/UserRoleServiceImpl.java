package com.dst.mobilele.mobilele.user.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.user.dto.UserRoleViewDTO;
import com.dst.mobilele.mobilele.user.entity.UserRole;
import com.dst.mobilele.mobilele.user.enums.Role;
import com.dst.mobilele.mobilele.user.repository.UserRoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleRepository repository;
    private final ModelMapper mapper;

    @Autowired
    public UserRoleServiceImpl(UserRoleRepository repository, ModelMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public void dbInit() {
        List<UserRole> roles = new ArrayList<>();

        roles.add(new UserRole().setRole(Role.USER));
        roles.add(new UserRole().setRole(Role.ADMIN));

        this.repository.saveAll(roles);
    }

    @Override
    public boolean isDbInit() {
        return this.repository.count() > 0;
    }

    @Override
    public List<UserRoleViewDTO> getAll() {
        return this.repository.findAll()
                .stream()
                .map(r -> this.mapper.map(r, UserRoleViewDTO.class))
                .collect(Collectors.toList());
    }
}
