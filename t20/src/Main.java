import java.util.Scanner;

public class Main {
    public static void main(String... args){
        System.out.println("Введите выражение: ");
        RPN rpn = new RPN(new Scanner(System.in).nextLine());
        System.out.println("Ответ: " + rpn.calc());
    }
}