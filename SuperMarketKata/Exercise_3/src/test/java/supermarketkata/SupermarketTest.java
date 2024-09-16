package supermarketkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.List;

import supermarketKata.ClientSale;
import supermarketKata.PricedProduct;
import supermarketKata.Supermarket;

class SupermarketTest {

    @Test
    public void priceSummary() {
        List<PricedProduct> products1 = List.of(
                new PricedProduct("water", 20, 5),
                new PricedProduct("bread", 40, 10),
                new PricedProduct("fruit", 35, 0)
        );
        List<PricedProduct> products2 = List.of(
                new PricedProduct("water", 20, 5),
                new PricedProduct("butter", 50, 10)
        );
        List<ClientSale> clientSales = List.of(
                new ClientSale("Rhonda", products1),
                new ClientSale("Winston", products2)
        );
        List<Integer> expected = List.of(90, 64);
        assertEquals(expected, Supermarket.calculateSummary(clientSales));
    }
}