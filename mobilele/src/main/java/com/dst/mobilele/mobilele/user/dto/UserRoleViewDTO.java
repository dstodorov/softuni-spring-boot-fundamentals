package com.dst.mobilele.mobilele.user.dto;

import com.dst.mobilele.mobilele.user.enums.Role;

public class UserRoleViewDTO {
    private String role;

    public String getRole() {
        return role;
    }

    public UserRoleViewDTO setRole(String role) {
        this.role = role;
        return this;
    }
}
