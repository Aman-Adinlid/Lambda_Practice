package se.lexicon.Interfaces;

import se.lexicon.Moudle.Product;
@FunctionalInterface
public interface Action {

    void execute(Product p);
}
