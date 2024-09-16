package supermarketkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

import supermarketKata.PricedProduct;
import supermarketKata.Supermarket;

class SupermarketTest {

    @Test
    public void priceSummary() {
        List<PricedProduct> products = List.of(
                new PricedProduct("water", 20, 5),
                new PricedProduct("bread", 40, 10),
                new PricedProduct("fruit", 35, 0)
        );
        assertEquals(90, Supermarket.calculateSummary(products));
    }
}