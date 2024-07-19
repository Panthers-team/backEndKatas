package supermarketKata;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Supermarket {
    public static List<Integer> getClientSummary(List<ClientSale> clientSaleList) {
        return clientSaleList.stream()
                .map(client -> client.getProducts().stream()
                        .mapToInt(PricedProduct::getProductPriceAfterOffer)
                        .sum())
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());
    }
}