package functions.consumer;

import model.DefaultProduct;
import model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Summary:
    -> consumer Interface
    -> Biconsumer Interface
*/
public class ConsumerDemo {

    public static void main(String[] args) {
        System.out.println("========== Consumer demo ==========");

        List<Product> products = new ArrayList<>(Arrays.asList(
            new DefaultProduct(1, "Product 1", "Category 1", 99.99),
            new DefaultProduct(2, "Product 2", "Category 2", 149.99),
            new DefaultProduct(3, "Product 3", "Category 3", 39.99)
        ));

        increasePriceForProductList(products, 10);

        products.forEach(System.out::println);

        System.out.println("========== BiConsumer demo ==========");
        Map<Integer, Product> idProductMap = new HashMap<>();
        idProductMap.put(1, new DefaultProduct(1, "Product 1", "Category 1", 99.99));
        idProductMap.put(2, new DefaultProduct(2, "Product 2", "Category 2", 149.99));
        idProductMap.put(3, new DefaultProduct(3, "Product 3", "Category 3", 39.99));

        increasePriceForProductMap(idProductMap, 10);

        idProductMap.values().forEach(System.out::println);
    }

    public static void increasePriceForProductList(List<? extends Product> products, double priceToIncrease) {
        products.iterator().forEachRemaining( product -> product.setPrice(product.getPrice() + priceToIncrease));
    }

    public static void increasePriceForProductMap(Map<Integer, ? extends Product> idProductMap, double priceToIncrease) {
        idProductMap.forEach( (id, product) -> product.setPrice(product.getPrice() + priceToIncrease));
    }

}

