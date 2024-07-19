package supermarketkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

import supermarketKata.PricedProduct;
import supermarketKata.Supermarket;

class SupermarketTest {

    @Test
    public void priceSummary() {
        List<PricedProduct> products = List.of(new PricedProduct("water", 20),
        new PricedProduct("milk", 3),
        new PricedProduct("eggs", 89),
        new PricedProduct("sugar", 13)
    );
        assertEquals(Supermarket.calculateSummary(products), 125);
    }
}