package com.packt.webstore.domain.repository;

import java.util.List;
import java.util.Set;
import java.util.Map;
import com.packt.webstore.domain.Product;

public interface ProductRepository {
 List<Product> getAllProducts();
 
 Product getProductById(String productId);
 
 List<Product>getProductsByCategory(String category);
 
 Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
}
