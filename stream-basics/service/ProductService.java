package service;

import model.Product;

import java.util.List;

public class ProductService {
    public List<Product> findProductUnderPrice(List<Product> products, double maxPrice){
        return products.stream()
                .filter(product -> product.getPrice() < maxPrice)
                .toList();

    }
}
