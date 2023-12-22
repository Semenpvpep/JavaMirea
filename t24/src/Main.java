public class Main {
    public static void main(String... args) {
        TableOrdersManager tableOrdersManager = new TableOrdersManager();
        TableOrder tableOrder = new TableOrder();

        MenuItem menuItem = new MenuItem(20, "рыба", "крутая");
        tableOrder.add(menuItem);
        MenuItem menuItem1 = new MenuItem(30, "рыба", "еще круче");
        tableOrder.add(menuItem1);
        MenuItem menuItem2 = new MenuItem(10, "мясо", "вкусное");
        tableOrder.add(menuItem2);
        MenuItem menuItem3 = new MenuItem(40, "котлета", "крутая");
        tableOrder.add(menuItem3);

        tableOrder.add(menuItem);
        tableOrdersManager.add(tableOrder, 1);

        System.out.println("Общая стоимость: " + tableOrdersManager.ordersCostSummary());
        System.out.println("Сколько рыбы: " + tableOrdersManager.itemsQuantity("рыба"));
        System.out.println("Свободные столики: " + tableOrdersManager.freeTableNumbers());
        tableOrdersManager.removeAll(tableOrder);
        System.out.println("Общая стоимость: " + tableOrdersManager.ordersCostSummary());
    }
}