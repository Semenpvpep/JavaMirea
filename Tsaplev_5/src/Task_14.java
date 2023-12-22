import java.util.Scanner;
public class Task_14 {
    public static void func(int i) {
        if (i < 10) {
            System.out.print(i + " ");
        }
        else {
            int lastDigit = i % 10, remainDigit = i / 10;
            func(remainDigit);
            System.out.print(lastDigit + " ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        func(i);
    }
}
