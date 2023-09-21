package io.swagger.dao;

import io.swagger.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CateogryDao extends JpaRepository<Category,String> {
}
