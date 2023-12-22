import java.util.ArrayList;
import java.util.List;

public class InternetOrderManager implements OrdersManager{

    private QueueNode head;
    private int size;
    public InternetOrderManager() {
        head = new QueueNode(null);
        head.setNext(head);
        head.setPrevious(head);
        size = 0;
    }

    private static class QueueNode {
        private Object data;
        private QueueNode next;
        private QueueNode previous;

        public QueueNode(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public QueueNode getNext() {
            return next;
        }

        public void setNext(QueueNode next) {
            this.next = next;
        }

        public QueueNode getPrevious() {
            return previous;
        }

        public void setPrevious(QueueNode previous) {
            this.previous = previous;
        }
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        QueueNode currentNode = head.getNext();
        while (currentNode != head) {
            orders.add((Order)currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return orders;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int summ = 0;
        QueueNode currentNode = head.getNext();
        while (currentNode != head) {
            if (((MenuItem)currentNode.getData()).getName().equals(itemName)){
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int summ = 0;
        QueueNode currentNode = head.getNext();
        while (currentNode != head) {
            if (currentNode.getData() == item){
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public int ordersCostSummary() {
        int summ = 0;
        QueueNode currentNode = head.getNext();
        while (currentNode != head) {
            summ += ((MenuItem)currentNode.getData()).getCost();
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public int ordersQuantity() {
        int summ = 0;
        QueueNode currentNode = head.getNext();
        while (currentNode != head) {
            summ += ((Order)currentNode.getData()).itemsQuantity();
            currentNode = currentNode.getNext();
        }
        return summ;
    }
}