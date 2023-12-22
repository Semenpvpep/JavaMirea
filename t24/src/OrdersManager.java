import java.util.List;

public interface OrdersManager {
    List<Order> getOrders();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    int ordersCostSummary();
    int ordersQuantity();
}