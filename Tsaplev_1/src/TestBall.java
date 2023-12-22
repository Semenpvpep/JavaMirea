public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(15, "Green");
        System.out.println(b1);
        System.out.println(b2);
        b1.setR(999999);
        b1.setColor("Blue");
        System.out.println(b1);
    }
}
