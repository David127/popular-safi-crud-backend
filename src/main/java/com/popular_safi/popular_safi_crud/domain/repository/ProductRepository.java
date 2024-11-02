package com.popular_safi.popular_safi_crud.domain.repository;

import com.popular_safi.popular_safi_crud.domain.Product;
import com.popular_safi.popular_safi_crud.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    List<Product> getAll();
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    Product update(int productId, Product product);
    void delete(int productId);

}
