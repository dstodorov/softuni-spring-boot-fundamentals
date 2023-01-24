package com.dst.mobilele.mobilele.user.services;

import com.dst.mobilele.mobilele.core.services.DatabaseInitService;
import com.dst.mobilele.mobilele.user.dto.UserRoleViewDTO;

import java.util.List;

public interface UserRoleService extends DatabaseInitService {
    List<UserRoleViewDTO> getAll();
}
