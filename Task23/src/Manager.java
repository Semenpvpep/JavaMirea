import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Manager {
    private Node head;
    private int size;

    public Manager() {
        head = new Node(null);
        head.setNext(head);
        head.setPrevious(head);
        size = 0;
    }

    private static class Node {
        int tableNumber;
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
        public void setTableNumber(int tableNumber){this.tableNumber = tableNumber;}
        public int getTableNumber(){return this.tableNumber;}
    }

    public void add(Object element, int tableNumber) {
        Node newNode = new Node(element);
        newNode.setNext(head.getNext());
        newNode.setPrevious(head);
        newNode.setTableNumber(tableNumber);
        head.getNext().setPrevious(newNode);
        head.setNext(newNode);
        size++;
    }

    public int removeALl(String element, int tableNumber) {
        int table;
        int summ = 0;
        Node currentNode = head.getNext();
        while (currentNode != head) {
            table = currentNode.getTableNumber();
            if (table == tableNumber) {
                return ((Order)currentNode.getData()).removeALl(element);
            }
            currentNode = currentNode.getNext();
        }
        return 0;
    }

    public boolean remove(String element, int tableNumber) {
        int table;
        Node currentNode = head.getNext();
        while (currentNode != head) {
            table = currentNode.getTableNumber();
            if (table == tableNumber) {
                return ((Order)currentNode.getData()).remove(element);
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }


    public int totalCost(int tableNumber) {
        Node currentNode = head.getPrevious();
        while (currentNode != head) {
            if (currentNode.getTableNumber() == tableNumber){
                return ((Order)currentNode.getData()).totalCost();
            }
            currentNode = currentNode.getNext();
        }
        return 0;
    }

    public int totalDishes(String element) {
        int summ = 0;
        Node currentNode = head.getNext();
        while (currentNode != head) {
            summ +=((Order)currentNode.getData()).totalDishes(element);
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    public Dish[] uniqueDishes(int tableNumber) {
        Node currentNode = head.getPrevious();
        while (currentNode != head) {
            if (currentNode.getTableNumber() == tableNumber){
                return ((Order)currentNode.getData()).uniqueDishes();
            }
        }
        return null;
    }

    public Dish[] getSorted(int tableNumber){
        Node currentNode = head.getPrevious();
        while (currentNode != head) {
            if (currentNode.getTableNumber() == tableNumber){
                return ((Order)currentNode.getData()).getSorted();
            }
        }
        return null;
    }
}