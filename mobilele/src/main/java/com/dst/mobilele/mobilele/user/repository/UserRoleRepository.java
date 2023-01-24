package com.dst.mobilele.mobilele.user.repository;

import com.dst.mobilele.mobilele.user.dto.UserRoleViewDTO;
import com.dst.mobilele.mobilele.user.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, String> {
}
