package com.dst.mobilele.mobilele.core.dto;


public abstract class BaseEntityDTO {
    private String id;


    public String getId() {
        return id;
    }

    public BaseEntityDTO setId(String id) {
        this.id = id;
        return this;
    }
}
