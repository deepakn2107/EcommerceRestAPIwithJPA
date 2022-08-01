package com.npci.thymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.npci.thymeleaf.entity.Product;

@RepositoryRestResource(path="product")
@CrossOrigin("http://localhost:4200/")
public interface ProductRepositoty extends JpaRepository<Product, Integer>{

}
