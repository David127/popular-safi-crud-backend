package com.popular_safi.popular_safi_crud.domain.service;

import com.popular_safi.popular_safi_crud.domain.Product;
import com.popular_safi.popular_safi_crud.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId) {
        return productRepository.getProduct(productId);
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> update(int productId, Product product) {
        return getProduct(productId).map((productFound) -> {
            return productRepository.update(productId, product);
        });
    }

    public boolean delete(int productId) {
        return getProduct(productId).map(productFound -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }

}
