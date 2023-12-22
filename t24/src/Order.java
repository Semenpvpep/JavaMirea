import java.util.List;

public interface Order {
    boolean add(MenuItem item);
    List<String> itemsNames();
    int itemsQuantity();
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem itemName);
    List <MenuItem> getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem item);
    int removeALl(String itemName);
    int removeALl(MenuItem item);
    List <MenuItem> sortedItemsByCostDesc();
    int costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
}