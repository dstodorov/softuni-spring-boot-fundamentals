package com.dst.mobilele.mobilele.brand.repository;

import com.dst.mobilele.mobilele.brand.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, String> {
}
