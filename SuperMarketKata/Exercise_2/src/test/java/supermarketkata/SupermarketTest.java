package supermarketkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

import supermarketKata.PricedProduct;
import supermarketKata.Supermarket;

class SupermarketTest {

    @Test
    public void priceSummary() {
        List<PricedProduct> products = List.of(new PricedProduct("water", 20, 7),
                new PricedProduct("milk", 3, 13),
                new PricedProduct("eggs", 89, 21),
                new PricedProduct("sugar", 13, 14)
        );

        assertEquals(103, Supermarket.calculateSummary(products));
    }
}