package com.dst.mobilele.mobilele.brand.dto;

import com.dst.mobilele.mobilele.core.dto.BaseEntityDTO;
import jakarta.persistence.Column;

import java.time.LocalDateTime;

public class BrandDTO extends BaseEntityDTO {

    private String name;
    private LocalDateTime created;
    private LocalDateTime modified;

    public String getName() {
        return name;
    }

    public BrandDTO setName(String name) {
        this.name = name;
        return this;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public BrandDTO setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public BrandDTO setModified(LocalDateTime modified) {
        this.modified = modified;
        return this;
    }
}
