import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestTask extends Drink_Queue {
    public static void main(String[] args) {

        // ОБЪЯВЛЕНИЕ ЭЛЕМЕНТОВ

        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Колода первого игрока: ");
        String d1 = in.next();
        System.out.println("Колода второго игрока: ");
        String d2 = in.next();
        Queue<Integer> queue1 = new LinkedList<>();
        fillQueue(d1, queue1);
        Queue<Integer> queue2 = new LinkedList<>();
        fillQueue(d2, queue2);

        // ПРОВЕРКА СТАРШЕЙ КАРТЫ И ВЫВОД РЕЗУЛЬТАТА
        checkCardPrintResult(queue1, queue2, k);
    }
}
