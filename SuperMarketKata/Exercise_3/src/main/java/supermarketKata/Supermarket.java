package supermarketKata;

import java.util.List;
import java.util.stream.Collectors;

public class Supermarket {
    public static List<Integer> calculateSummary(List<ClientSale> clientSaleList) {
        return clientSaleList.stream()
                .map(client -> client.getProducts().stream()
                        .mapToInt(PricedProduct::getProductPriceAfterOffer)
                        .sum())
                .sorted()
                .collect(Collectors.toList());
    }
}