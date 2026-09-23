import model.Product;
import service.GstService;
import service.ProductService;

import java.util.List;

/*
*
* 7. Find products under RS.1000
    * Find product < 1000
    * print their names
    * Practice: filter() + map()
*
* */

public class TransformProducts {
    static void main() {

        List<Product> products = List.of(
                new Product("Rice",200),
                new Product("Head Phone", 2000),
                new Product("Water Bottle", 950),
                new Product("Slipper", 560),
                new Product("Wooden Table", 10000)
                );

        ProductService productService = new ProductService();
        double maxPrice = 1000;
        System.out.println("Find products under RS.1000");
        System.out.println("---------------------------");
        List<Product> affordableProducts = productService.findProductUnderPrice(products, maxPrice);
        affordableProducts.forEach(product -> System.out.println(product.getName()));

        GstService gstService = new GstService();
        System.out.println("Convert Prices: GST%");
        System.out.println("--------------------");
        double GST = 18;
        List<Product> convertedPrice = gstService.applyGst(products,GST);
        convertedPrice.forEach(System.out::println);



    }

}
