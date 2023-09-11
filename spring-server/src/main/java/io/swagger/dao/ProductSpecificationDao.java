package io.swagger.dao;

import io.swagger.model.ProductSpecification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSpecificationDao extends JpaRepository<ProductSpecification, String> {
}
