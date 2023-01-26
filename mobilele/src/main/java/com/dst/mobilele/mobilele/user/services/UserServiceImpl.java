package com.dst.mobilele.mobilele.user.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.user.dto.UserRegisterDTO;
import com.dst.mobilele.mobilele.user.entity.User;
import com.dst.mobilele.mobilele.user.entity.UserRole;
import com.dst.mobilele.mobilele.user.enums.Role;
import com.dst.mobilele.mobilele.user.repository.UserRepository;
import com.dst.mobilele.mobilele.user.repository.UserRoleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, DatabaseInitService {

    private final UserRepository repository;
    private final UserRoleRepository roleRepository;
    private final ModelMapper mapper;

    @Autowired
    public UserServiceImpl(UserRepository repository, UserRoleRepository roleRepository, ModelMapper mapper) {
        this.repository = repository;
        this.roleRepository = roleRepository;
        this.mapper = mapper;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return this.repository.count() > 0;
    }


    @Override
    public void saveUser(UserRegisterDTO userRegisterDTO) {

        User user = mapper.map(userRegisterDTO, User.class);

        UserRole userRole = this.roleRepository.findByRole(Role.valueOf(userRegisterDTO.getRole()));
        user.setRole(userRole);

        this.repository.saveAndFlush(user);
    }
}
