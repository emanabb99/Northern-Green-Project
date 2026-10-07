import java.util.List;

public class Order {
    String consumerName;
    String consumerEmail;
    List<OrderItem> items;
    String status;

    public Order(List<OrderItem> items, String consumerName, String consumerEmail) {
        this.items = items;
        status = "Paid";
        this.consumerName = consumerName;
        this.consumerEmail = consumerEmail;
        this.price = calculatePrice();
    }

    public double calculatePrice() {
        double totalPrice = 0.0;
        for (OrderItem item : items) {
            totalPrice += item.product.price;
        }
        return totalPrice;
    }
}
