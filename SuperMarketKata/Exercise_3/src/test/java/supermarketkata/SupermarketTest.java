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
        PricedProduct pricedProduct = new PricedProduct("water", 20, 0);
        ClientSale clientSale = new ClientSale("Meeri", List.of(pricedProduct));
        List<ClientSale> clientSales = List.of(clientSale);
        assertEquals(Supermarket.getClientSales(clientSales), List.of(20));
    }

    @Test
    public void priceSummaryWithOffer() {
        PricedProduct pricedProduct = new PricedProduct("water", 20, 5);
        ClientSale clientSale = new ClientSale("Meeri", List.of(pricedProduct));
        List<ClientSale> clientSales = List.of(clientSale);
        assertEquals(Supermarket.getClientSales(clientSales), List.of(19));
    }

    @Test
    public void priceSummaryMultipleProducts() {
        PricedProduct pricedProduct = new PricedProduct("water", 20, 5);
        PricedProduct pricedProduct1 = new PricedProduct("milk", 20, 5);
        ClientSale clientSale = new ClientSale("Meeri", List.of(pricedProduct, pricedProduct1));
        List<ClientSale> clientSales = List.of(clientSale);
        assertEquals(Supermarket.getClientSales(clientSales), List.of(38));
    }

    @Test
    public void priceSummaryMultipleSales() {
        PricedProduct pricedProduct = new PricedProduct("water", 20, 5);
        PricedProduct pricedProduct1 = new PricedProduct("milk", 40, 5);
        ClientSale clientSale = new ClientSale("Meeri", List.of(pricedProduct));
        ClientSale clientSale1 = new ClientSale("Liisa", List.of(pricedProduct, pricedProduct1));
        List<ClientSale> clientSales = List.of(clientSale, clientSale1);
        assertEquals(Supermarket.getClientSales(clientSales), List.of(57, 19));
    }
}