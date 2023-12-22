import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Order {
    private Node head;
    private int size;

    public Order() {
        head = new Node(null);
        head.setNext(head);
        head.setPrevious(head);
        size = 0;
    }

    private static class Node {

        private Object data;
        private Node next;
        private Node previous;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    public void add(Object element) {
        Node newNode = new Node(element);
        newNode.setNext(head.getNext());
        newNode.setPrevious(head);
        head.getNext().setPrevious(newNode);
        head.setNext(newNode);
        size++;
    }

    public int removeALl(String element) {
        String dish;
        int summ = 0;
        Node currentNode = head.getNext();
        while (currentNode != head) {
            dish = ((Dish)currentNode.getData()).getName();
            if (element.equals(dish)) {
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                size--;
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    public boolean remove(String element) {
        String dish;
        Node currentNode = head.getPrevious();
        while (currentNode != head) {
            dish = ((Dish)currentNode.getData()).getName();
            if (element.equals(dish)) {
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                size--;
                return true;
            }
            currentNode = currentNode.getPrevious();
        }
        return false;
    }


    public int totalCost() {
        int summ = 0;
        Node currentNode = head.getPrevious();
        while (currentNode != head) {
            summ += ((Dish)currentNode.getData()).getCost();
            currentNode = currentNode.getPrevious();
        }
        return summ;
    }

    public int totalDishes(String element) {
        String dish;
        int summ = 0;
        Node currentNode = head.getPrevious();
        while (currentNode != head) {
            dish = ((Dish)currentNode.getData()).getName();
            if (element.equals(dish)) {
                summ++;
            }
            currentNode = currentNode.getPrevious();
        }
        return summ;
    }

    boolean unique(Order dishes, String dish){
        Node currentNode = dishes.getHead().getNext();
        while (currentNode != dishes.getHead()) {
            String oneDish;
            oneDish = ((Dish)currentNode.data).getName();
            if (oneDish == null) break;
            if (oneDish.equals(dish)){
                return false;
            }
            currentNode = currentNode.getNext();
        }
        return true;
    }

    public Dish[] uniqueDishes() {
        Order dishes = new Order();
        Node currentNode = head.getNext();
        int i = 0;
        while (currentNode != head){
            String dish = ((Dish)currentNode.getData()).getName();
            if (unique(dishes, dish)){
                dishes.add(((Dish)currentNode.getData()));
                i++;
            }
            currentNode = currentNode.getNext();
        }
        Dish[] uniqueDishes = new Dish[i];
        currentNode = dishes.getHead().getNext();
        for (int j = 0; j < i; j ++){
            uniqueDishes[j] = ((Dish)currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return uniqueDishes;
    }

    public Dish[] getSorted(){
        Dish[] dishes = new Dish[size];
        int i = 0;
        Node currentNode = head.getNext();
        while (currentNode != head){
            dishes[i] = (Dish)currentNode.getData();
            i++;
            currentNode = currentNode.getNext();
        }
        coolSort(dishes);
        return dishes;
    }

    public void coolSort(Dish[] dishes){
        for (int i = 0; i < size; i++){
            for (int j = i; j < size; j++){
                if (dishes[j].getCost() > dishes[i].getCost()){
                    Dish tmp = dishes[i];
                    dishes[i] = dishes[j];
                    dishes[j] = tmp;
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Node getHead(){
        return head;
    }
}