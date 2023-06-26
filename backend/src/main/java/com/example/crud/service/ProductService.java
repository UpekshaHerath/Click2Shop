package com.example.crud.service;

import com.example.crud.entity.Product;
import com.example.crud.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    // return a one product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // return all the products
    public List<Product> saveProduct(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductByID(int id) {
        return repository.findById(id).orElse(null);
    }

    public Product getProductByID(String name) {
        return repository.findByName(name);
    }

    // delete product
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product deleted || " + id;
    }

    /**
     * update product
     * @param product
     * @return
     */
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}
