package com.product.product.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {

    @RequestMapping(value = "/api/products", method = RequestMethod.GET)
    ResponseEntity<String> getProducts() {
        HashMap<String, String> products = new HashMap<>();
        products.put("Name", "Reynolds");
        products.put("Name", "Cello");
        return new ResponseEntity<>(products.toString(), HttpStatus.OK);
    }
}
