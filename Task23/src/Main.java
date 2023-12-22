import java.util.Arrays;

public class Main {
    public static void main(String... args) {
        Manager manager = new Manager();

        Order order = new Order();

        Dish dish = new Dish("Рыба", "tasty", 20);
        order.add(dish);

        dish = new Dish("Мясо", "tasty", 20);
        order.add(dish);

        dish = new Dish("Рыба", "not tasty", 40);
        order.add(dish);

        dish = new Dish("Котлета", "tasty", 10);
        order.add(dish);

        manager.add(order, 1);

        System.out.println("Общая стоимость заказа первого столика: " + manager.totalCost(1));
        System.out.println("Все блюда первого столика: \n" + Arrays.toString(manager.getSorted(1)));
        System.out.println("Все уникальные блюда первого столика: \n" + Arrays.toString(manager.uniqueDishes(1)));
        System.out.println("Удалил все Рыба: " + manager.removeALl("Рыба", 1));
        System.out.println("Удалил Рыба: " + manager.remove("Рыба", 1));
        System.out.println("Все Мясо: " + manager.totalDishes("Мясо"));
    }
}