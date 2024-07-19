package supermarketkata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import supermarketKata.ClientSale;
import supermarketKata.PricedProduct;
import supermarketKata.Supermarket;

class SupermarketTest {

    @Test
    public void priceSummary() {
        List<ClientSale> clientSaleList = List.of(
                new ClientSale(
                "john", List.of(
                        new PricedProduct("water", 20, 7),
                        new PricedProduct("milk", 3, 13),
                        new PricedProduct("eggs", 89, 21),
                        new PricedProduct("sugar", 13, 14)
                )),
                new ClientSale("cena", List.of(
                        new PricedProduct("water", 20, 7),
                        new PricedProduct("sugar", 13, 14)
                ))
        );



        assertEquals(List.of(31, 105), Supermarket.calculateSummary(clientSaleList));
    }}