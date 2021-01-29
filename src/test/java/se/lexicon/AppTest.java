package se.lexicon;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import se.lexicon.Interfaces.Action;
import se.lexicon.Interfaces.Conditional;
import se.lexicon.Moudle.Product;

import java.util.ArrayList;
import java.util.List;


public class AppTest {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Tv", 2000, 2));
        products.add(new Product("Phone", 3000, 0));
        products.add(new Product("BTable", 200, 1));

        Conditional conditional = p -> p.getStock() == 0;
        Action action = p -> System.out.println(p);
        process(products, conditional, action);
        process(products, p -> p.getProdName().startsWith("B"), p -> System.out.println(p));

    }

    public static void process(List<Product> productList, Conditional filter, Action action) {

        for (Product product : productList) {
            if (filter.test(product)) {
                action.execute(product);
            }
        }
    }


}
