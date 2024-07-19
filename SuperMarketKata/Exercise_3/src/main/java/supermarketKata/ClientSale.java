package supermarketKata;

import java.util.List;

public class ClientSale {
    String name;
    List<PricedProduct> products;

    public ClientSale(String name, List<PricedProduct> products) {
        this.name = name;
        this.products = products;
    }

    public List<PricedProduct> getProducts() {
        return products;
    }
}
