import java.util.Scanner;
public class Task_15 {
    public static void func(int i) {
        if (i != 0) {
            System.out.print(i % 10);
            System.out.print(" ");
            func(i / 10);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        func(i);
    }
}
