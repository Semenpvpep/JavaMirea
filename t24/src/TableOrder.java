import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TableOrder implements Order{

    int size = 0;

    List<MenuItem> items = new ArrayList<>();
    @Override
    public boolean add(MenuItem item) {
        for (MenuItem i: items){
            if (i == item){
                return false;
            }
        }
        items.add(item);
        size++;
        return true;
    }

    @Override
    public List<String> itemsNames() {
        List <String> names = new ArrayList<>();
        for (MenuItem i: items){
            if (!names.contains(i.getName())){
                names.add(i.getName());
            }
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int summ = 0;
        for (MenuItem i: items){
            if (Objects.equals(i.getName(), itemName)){
                summ++;
            }
        }
        return summ;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        int summ = 0;
        for (MenuItem i: items){
            if (i == itemName){
                summ++;
            }
        }
        return summ;
    }

    @Override
    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        for (MenuItem i: items){
            if (Objects.equals(i.getName(), itemName)){
                items.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        for (MenuItem i: items){
            if (i == item){
                items.remove(i);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public int removeALl(String itemName) {
        int summ = 0;
        for (MenuItem i: items){
            if (Objects.equals(i.getName(), itemName)){
                items.remove(i);
                size--;
                summ++;
            }
        }
        return summ;
    }

    @Override
    public int removeALl(MenuItem item) {
        int summ = 0;
        for (MenuItem i: items){
            if (i == item){
                items.remove(i);
                size--;
                summ++;
            }
        }
        return summ;
    }

    @Override
    public List<MenuItem> sortedItemsByCostDesc() {
        items.sort(new CompareItems());
        return items;
    }

    @Override
    public int costTotal() {
        int summ = 0;
        for (MenuItem i: items){
            summ += i.getCost();
        }
        return summ;
    }
}