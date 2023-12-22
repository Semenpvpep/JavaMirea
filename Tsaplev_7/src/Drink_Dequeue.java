import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Drink_Dequeue {
    // МЕТОД ЗАПОЛНЕНИЯ ОЧЕРЕДИ

    public static void fillQueue(String s, Deque<Integer> q) {
        for (char c : s.toCharArray()) {
            q.offerLast(Character.getNumericValue(c));
        }
    }
    public static void main(String[] args) {

        // ОБЪЯВЛЕНИЕ ЭЛЕМЕНТОВ

        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Колода первого игрока: ");
        String d1 = in.next();
        System.out.println("Колода второго игрока: ");
        String d2 = in.next();
        Deque<Integer> queue1= new LinkedList<>();
        fillQueue(d1, queue1);
        Deque<Integer> queue2= new LinkedList<>();
        fillQueue(d2, queue2);

        // ПРОВЕРКА СТАРШЕЙ КАРТЫ

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            System.out.println("\nПЕРВАЯ КОЛОДА: " + queue1);
            System.out.println("ВТОРАЯ КОЛОДА: " + queue2);
            if ((queue1.peekFirst() == 9 && queue2.peekFirst() == 0) || (queue1.peekFirst() < queue2.peekFirst() && queue2.peekFirst() != 9 && queue1.peekFirst() != 0)) {
                queue2.offerLast(queue1.peekFirst());
                queue1.pollFirst();
                queue2.offerLast(queue2.peekFirst());
                queue2.pollFirst();
            }
            else if ((queue1.peekFirst() == 0 && queue2.peekFirst() == 9) || (queue1.peekFirst() > queue2.peekFirst() && queue1.peekFirst() != 9 && queue2.peekFirst() != 0)) {
                queue1.offerLast(queue1.peekFirst());
                queue1.pollFirst();
                queue1.offerLast(queue2.peekFirst());
                queue2.pollFirst();
            }

            k += 1;
            if (k == 106) {
                System.out.println("botva");
                break;
            }
        }

        // ВЫВОД

        if (k < 106) {
            if (queue1.isEmpty()) {
                System.out.println("second " + k);
            }
            else {
                System.out.println("first " + k);
            }
        }
    }
}
