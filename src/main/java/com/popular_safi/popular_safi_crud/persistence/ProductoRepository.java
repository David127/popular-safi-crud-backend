package com.popular_safi.popular_safi_crud.persistence;

import com.popular_safi.popular_safi_crud.domain.Product;
import com.popular_safi.popular_safi_crud.domain.repository.ProductRepository;
import com.popular_safi.popular_safi_crud.persistence.crud.ProductoCrudRepository;
import com.popular_safi.popular_safi_crud.persistence.entity.Producto;
import com.popular_safi.popular_safi_crud.persistence.mapper.ProductMapper;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {

    @Autowired
    private ProductoCrudRepository productoCrudRepository;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getAll() {
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos);
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        return productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public Product update(int productId, Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }

}
