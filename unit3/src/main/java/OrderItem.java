public class OrderItem {
    Product product;
    int quantity;
    double pricePaid;

    public OrderItem(Product product, int quantity, double pricePaid) {
        this.product = product;
        this.quantity = quantity;
        this.pricePaid = pricePaid;
    }
}
