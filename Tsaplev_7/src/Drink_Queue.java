import java.util.*;

public class Drink_Queue {
    // МЕТОД ЗАПОЛНЕНИЯ ОЧЕРЕДИ
    public static void fillQueue(String s, Queue<Integer> q) {
        for (char c : s.toCharArray()) {
            q.offer(Character.getNumericValue(c));
        }
    }
    public static void checkCardPrintResult(Queue<Integer> queue1, Queue<Integer> queue2, int k) {
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            System.out.println("\nПЕРВАЯ КОЛОДА: " + queue1);
            System.out.println("ВТОРАЯ КОЛОДА: " + queue2);
            if ((queue1.peek() == 9 && queue2.peek() == 0) || (queue1.peek() < queue2.peek() && queue2.peek() != 9 && queue1.peek() != 0)) {
                queue2.offer(queue1.peek());
                queue1.poll();
                queue2.offer(queue2.peek());
                queue2.poll();
            } else if ((queue1.peek() == 0 && queue2.peek() == 9) || (queue1.peek() > queue2.peek() && queue1.peek() != 9 && queue2.peek() != 0)) {
                queue1.offer(queue1.peek());
                queue1.poll();
                queue1.offer(queue2.peek());
                queue2.poll();
            }

            k += 1;
            if (k == 106) {
                System.out.println("botva");
                break;
            }
        }
        if (k < 106) {
            if (queue1.isEmpty()) {
                System.out.println("second " + k);
            } else {
                System.out.println("first " + k);
            }
        }
    }
}
