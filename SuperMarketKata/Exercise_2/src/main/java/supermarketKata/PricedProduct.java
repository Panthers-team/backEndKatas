package supermarketKata;

public class PricedProduct {
    String productName;
    int productPrice;
    int offer;
    
    public PricedProduct(String productName, int productPrice, int offer) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.offer = offer;
    }

    public int getFinalPrice() {
        return this.productPrice - (this.productPrice * this.offer / 100);
    }
}
