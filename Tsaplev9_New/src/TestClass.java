public class TestClass {
    public static void main(String[] args) {
        Priceable m = new Milk(60);
        Priceable e = new Eggs(89);
        System.out.println("\nЦена яиц: " + e.getPrice());
        System.out.println("\nЦена молока: " + m.getPrice());
    }
}