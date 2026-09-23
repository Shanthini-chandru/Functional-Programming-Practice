package service;
import model.Product;

import java.util.List;
import java.util.function.Function;

public class GstService {
    public List<Product> applyGst(List<Product> products, double gst){
        double factor = ( gst / 100 )+1;
        System.out.println("GST:"+(int)gst+"%");
        Function<Product, Product> addGst = product -> new Product(product.getName(),
                product.getPrice()* factor );

        return products.stream()
                .map(addGst)
                .toList();


    }
}
