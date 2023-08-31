package io.swagger.dao;

import io.swagger.model.ProductOffering;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOfferingDao extends JpaRepository<ProductOffering, String> {
}
