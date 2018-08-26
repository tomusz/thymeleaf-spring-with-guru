package com.thymeleafspring.thymeleafspringwithguru.services;

import com.thymeleafspring.thymeleafspringwithguru.domain.Product;

import java.util.List;

public interface ProductService {

    Product getProduct(Integer id);

    List<Product> listProduct();
}
