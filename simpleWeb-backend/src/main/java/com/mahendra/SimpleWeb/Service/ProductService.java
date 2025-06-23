package com.mahendra.SimpleWeb.Service;

import com.mahendra.SimpleWeb.Model.Product;
import com.mahendra.SimpleWeb.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;


    public List<Product> getAllProducts() {
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProducts(Product prod) {
        repo.save(prod);
    }

    public void deleteProductById(int prodId) {
        repo.deleteById(prodId);
    }

    public void deleteProducts() {
        repo.deleteAll();
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }
}
