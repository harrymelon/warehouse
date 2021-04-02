package com.example.demo.service;

import com.example.demo.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    public Product getAll(){
        return new Product();
    }
}
