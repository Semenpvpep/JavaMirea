import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class TestQ {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < 10; i += 2) {
            queue.offer(i);
            s.push(i);
        }/*
        System.out.println(queue + " изначальная очередь");
        System.out.println(queue.peek() + " верхний элемент очереди");
        queue.poll();
        System.out.println(queue + " очередь после poll");
        queue.offer(999);
        System.out.println(queue + " очередь после offer 999");
        System.out.println(queue.peek() + " верхний элемент очереди");*/
        System.out.println(s + " начальный стек");
        System.out.println(s.peek() + " последний элемент стека");
        s.pop();
        System.out.println(s + " стек после pop");
        s.push(999);
        System.out.println(s + " стек после push");
        s.push(s.pop());
        System.out.println(s + " стек после push x pop");
    }
}
