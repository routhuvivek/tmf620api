package io.swagger.dao;

import io.swagger.model.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogDao extends JpaRepository<Catalog,String> {
}
