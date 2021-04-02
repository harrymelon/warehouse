package com.example.demo.controller;

import com.example.demo.domain.Product;
import com.example.demo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService = null;

    @RequestMapping(path="/get_all",method = RequestMethod.GET)
    public Product getAll(){return productService.getAll();}


}
