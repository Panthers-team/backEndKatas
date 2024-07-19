package supermarketKata;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Supermarket {
    public static List<Integer> getClientSales (List<ClientSale> clientSales) {
        return clientSales.stream()
                .map(clientSale -> clientSale.getProducts().stream()
                    .mapToInt(product -> product.productPrice - (product.productPrice * product.offer / 100))
                    .sum())
                .sorted((a, b) -> Integer.compare(b, a))
                .collect(Collectors.toList());
    }
}