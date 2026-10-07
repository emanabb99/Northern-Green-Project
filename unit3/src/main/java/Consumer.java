import java.util.ArrayList;
import java.util.List;

public class Consumer {
    String id;
    String name;
    String email;
    List<Order> orders = new ArrayList<>();
    List<Product> basket = new ArrayList<>();

    public Consumer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void addProductToBasket(Product product) {
        basket.add(product);
    }

    public void checkOut() {
        List<OrderItem> orderItems = new ArrayList<>();
        for (Product product: basket) {
            orderItems.add(new OrderItem(product,1, product.price));
        }
        Order order = new Order(orderItems,name,email);
        orders.add(order);
    }

}
