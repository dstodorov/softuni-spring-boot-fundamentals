package com.dst.mobilele.mobilele.offer.repository;

import com.dst.mobilele.mobilele.offer.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<Offer, String> {
}
