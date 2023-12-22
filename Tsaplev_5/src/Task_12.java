import java.util.Scanner;
public class Task_12 {
    public static void func() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i != 0) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            func();
        }
    }
    public static void main(String[] args) {
        func();
    }
}
