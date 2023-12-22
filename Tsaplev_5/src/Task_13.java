import java.util.Scanner;
public class Task_13 {
    public static void func() {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i != 0) {
            System.out.println(i);
            i = in.nextInt();
            func();
        }
    }    public static void main(String[] args) {
        func();
    }
}
