package com.example.inventory_service.respository;

import com.example.inventory_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<Product,Long> {
}