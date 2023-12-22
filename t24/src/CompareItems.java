import java.util.Comparator;

public class CompareItems implements Comparator<MenuItem> {

    @Override
    public int compare(MenuItem o1, MenuItem o2) {
        return Double.compare(o1.getCost(), o2.getCost());
    }
}