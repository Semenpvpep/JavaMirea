import java.util.Scanner;
import java.util.Stack;

public class Drink_Stack {

    // обнаруживание старшей карты в стеке

    public static int find(Stack<Integer> s) {
        Stack<Integer> sh = new Stack<>();
        forPush(s, sh, s.size() - 1);
        int element = s.peek();
        forPush(sh, s, sh.size());
        return element;
    }

    // ЗАПОЛНЕНИЕ СТЕКОВ

    public static void fillStack(String s, Stack<Integer> st) {
        for (char c : s.toCharArray()) {
            st.push(Character.getNumericValue(c));
        }
    }

    // МЕТОД ДЛЯ ПЕРЕМЕЩЕНИЯ ВСЕХ ЭЛЕМЕНТОВ ОДНОГО СТЕКА В ДРУГОЙ

    public static void forPush(Stack<Integer> s1, Stack<Integer> s2, int k) {
        for (int i = 0; i < k; i++) {
            s2.push(s1.pop());
        }
    }

    // МЕТОД УКЛАДКИ ДВУХ КАРТ ПОБЕДИТЕЛЮ

    public static void insert(int winner, Stack<Integer> s1, Stack<Integer> s2) {
        Stack<Integer> stackHelper = new Stack<>();
        // ЕСЛИ БОЛЬШЕ У 1-ГО
        if (winner == 1) {
            forPush(s2, stackHelper, s2.size() - 1);
            s1.push(s2.pop());
            forPush(stackHelper, s2, stackHelper.size());
            forPush(s1, stackHelper, s1.size() - 1);
            s2.push(s1.pop());
            forPush(stackHelper, s1, stackHelper.size() - 1);
            s1.push(s2.pop());
            s1.push(stackHelper.pop());
        }
        // ЕСЛИ БОЛЬШЕ У 2-ГО
        else {
            forPush(s1, stackHelper, s1.size() - 1);
            s2.push(s1.pop());
            forPush(stackHelper, s1, stackHelper.size());
            forPush(s2, stackHelper, s2.size() - 1);
            s1.push(s2.pop());
            forPush(stackHelper, s2, stackHelper.size());
            s2.push(s1.pop());
        }
    }

    // MAIN

    public static void main(String[] args) {

        // ОБЪЯВЛЕНИЕ ЭЛЕМЕНТОВ

        Scanner in = new Scanner(System.in);
        System.out.println("Колода первого игрока: ");
        String d1 = in.next();
        System.out.println("Колода второго игрока: ");
        String d2 = in.next();
        Stack<Integer> stack1 = new Stack<>();
        fillStack(d1, stack1);
        Stack<Integer> stack2 = new Stack<>();
        fillStack(d2, stack2);
        int k = 0;

        // ПРОВЕРКА СТАРШЕЙ КАРТЫ

        while (!stack1.isEmpty() && !stack2.isEmpty()) {
            System.out.println("\nПЕРВАЯ КОЛОДА: " + stack1);
            System.out.println("ВТОРАЯ КОЛОДА: " + stack2);
            if ((find(stack1) == 9 && find(stack2) == 0) || (find(stack1) < find(stack2) && find(stack2) != 9 && find(stack1) != 0)) {
                insert(2, stack1, stack2);
            }
            else if ((find(stack1) == 0 && find(stack2) == 9) || (find(stack1) > find(stack2) && find(stack1) != 9 && find(stack2) != 0)) {
                insert(1, stack1, stack2);
            }

            k += 1;
            if (k == 106 && !stack1.isEmpty() && !stack2.isEmpty()) {
                System.out.println("botva");
                break;
            }
        }
        // ВЫВОД
        if (k < 106) {
            if (stack1.isEmpty()) {
                System.out.println("second " + k);
            }
            else {
                System.out.print("first " + k);
            }
        }
    }
}
