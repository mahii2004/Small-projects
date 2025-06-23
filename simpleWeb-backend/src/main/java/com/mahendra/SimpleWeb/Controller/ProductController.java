package com.mahendra.SimpleWeb.Controller;

import com.mahendra.SimpleWeb.Model.Product;
import com.mahendra.SimpleWeb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping("/products")
    public List<Product> getAllProducts(){
       return service.getAllProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
        service.addProducts(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public String deleteProductById(@PathVariable int prodId){
        service.deleteProductById(prodId);
        return "deleted successfully " + prodId;
    }

    @DeleteMapping("/products")
    public String deleteProductById(){
        service.deleteProducts();
        return "All Products deleted successfully ";
    }

    @PutMapping("/products")
    public String updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
        return "Updated Successfully";
    }



}
