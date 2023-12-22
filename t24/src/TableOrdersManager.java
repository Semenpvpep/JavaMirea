import java.util.ArrayList;
import java.util.List;

public class TableOrdersManager implements OrdersManager{

    int free = 20;
    Order[] orders = new Order[20];

    public void add(Order order, int tableNumber){
        orders[tableNumber - 1] = order;
        free--;
    }

    public void addItem(MenuItem item, int tableNumber){
        orders[tableNumber - 1].add(item);
    }

    public int freeTableNumber(){
        return free;
    }

    public List<Integer> freeTableNumbers(){
        List<Integer> freeTables = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            if (orders[i] == null){
                freeTables.add(i + 1);
            }
        }
        return freeTables;
    }

    public Order getOrder(int tableNumber){
        return orders[tableNumber - 1];
    }

    public void remove(int tableNumber){
        orders[tableNumber - 1] = null;
    }

    public int remove(Order order){
        for (int i = 0; i < 20; i++){
            if (orders[i] == order){
                orders[i] = null;
                return i + 1;
            }
        }
        return 0;
    }

    public int removeAll(Order order){
        int summ = 0;
        for (int i = 0; i < 20; i++){
            if (orders[i] == order){
                orders[i] = null;
                summ++;
            }
        }
        return summ;
    }

    @Override
    public List<Order> getOrders() {
        return new ArrayList<>(List.of(orders));
    }

    @Override
    public int itemsQuantity(String itemName) {
        int summ = 0;
        for (Order i: orders){
            if (i != null){
                for (MenuItem j: i.getItems()) {
                    if (j.getName().equals(itemName)) {
                        summ++;
                    }
                }
            }
        }
        return summ;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int summ = 0;
        for (Order i: orders){
            for (MenuItem j: i.getItems()){
                if (j == item){
                    summ++;
                }
            }
        }
        return summ;
    }

    @Override
    public int ordersCostSummary() {
        int summ = 0;
        for (Order i: orders){
            if (i != null) {
                for (MenuItem j : i.getItems()) {
                    summ += j.getCost();
                }
            }
        }
        return summ;
    }

    @Override
    public int ordersQuantity() {
        return orders.length;
    }
}