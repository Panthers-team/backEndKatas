package supermarketKata;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Supermarket {
    public static List<Integer> calculateSummary(List<ClientSale> clientSaleList) {
        return clientSaleList
                .stream()
                .map(s -> s.getProducts()
                        .stream()
                        .mapToInt(PricedProduct::getFinalPrice)
                        .sum()
                )
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}