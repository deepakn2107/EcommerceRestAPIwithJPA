package com.npci.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.npci.thymeleaf.entity.ProductCategory;

@RepositoryRestResource(path="category")
@CrossOrigin("http://localhost:4200/")
public interface ProductCategoryRepostory extends JpaRepository<ProductCategory, Integer> {

}
