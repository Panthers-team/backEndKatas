package supermarketKata;

import java.util.List;

public class ClientSale {
    String clientName;
    List<PricedProduct> products;

    public ClientSale(String clientName, List<PricedProduct> products) {
        this.clientName = clientName;
        this.products = products;
    }

    public List<PricedProduct> getProducts() {
        return products;
    }
}
