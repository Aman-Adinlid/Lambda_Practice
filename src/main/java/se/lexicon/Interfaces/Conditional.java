package se.lexicon.Interfaces;

import se.lexicon.Moudle.Product;
@FunctionalInterface
public interface Conditional {

    boolean test(Product p);
}
