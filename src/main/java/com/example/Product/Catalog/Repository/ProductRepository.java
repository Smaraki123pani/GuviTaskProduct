package com.example.Product.Catalog.Repository;

import com.example.Product.Catalog.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    //DAO section
}