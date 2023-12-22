import java.util.ArrayList;
import java.util.List;

public class InternetOrder implements Order{

    private ListNode head;
    private int size;
    public InternetOrder() {
        head = new ListNode(null);
        head.setNext(head);
        head.setPrevious(head);
        size = 0;
    }

    private static class ListNode {
        private Object data;
        private ListNode next;
        private ListNode previous;

        public ListNode(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        public ListNode getPrevious() {
            return previous;
        }

        public void setPrevious(ListNode previous) {
            this.previous = previous;
        }
    }

    @Override
    public boolean add(MenuItem item) {
        ListNode newNode = new ListNode(item);
        newNode.setNext(head.getNext());
        newNode.setPrevious(head);
        head.getNext().setPrevious(newNode);
        head.setNext(newNode);
        size++;
        return true;
    }

    @Override
    public List<String> itemsNames() {
        List<String> names = new ArrayList<>();
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (!names.contains(((MenuItem)currentNode.getData()).getName())){
                names.add(((MenuItem)currentNode.getData()).getName());
            }
            currentNode = currentNode.getNext();
        }
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int summ = 0;
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (((MenuItem)currentNode.getData()).getName().equals(itemName)){
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public int itemsQuantity(MenuItem itemName) {
        int summ = 0;
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (currentNode.getData() == itemName){
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public List<MenuItem> getItems() {
        List<MenuItem> items = new ArrayList<>();
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            items.add((MenuItem)currentNode.getData());
            currentNode = currentNode.getNext();
        }
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (((MenuItem)currentNode.getData()).getName().equals(itemName)){
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                size--;
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public boolean remove(MenuItem item) {
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (currentNode.getData() == item){
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                size--;
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public int removeALl(String itemName) {
        int summ = 0;
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (((MenuItem)currentNode.getData()).getName().equals(itemName)){
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                size--;
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public int removeALl(MenuItem item) {
        int summ = 0;
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            if (currentNode.getData() == item){
                currentNode.getPrevious().setNext(currentNode.getNext());
                currentNode.getNext().setPrevious(currentNode.getPrevious());
                size--;
                summ++;
            }
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    @Override
    public List<MenuItem> sortedItemsByCostDesc() {
        List<MenuItem> sorted = new ArrayList<>();
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            sorted.add((MenuItem)currentNode.getData());
            currentNode = currentNode.getNext();
        }
        sorted.sort(new CompareItems());
        return sorted;
    }

    @Override
    public int costTotal() {
        int summ = 0;
        ListNode currentNode = head.getNext();
        while (currentNode != head) {
            summ += ((MenuItem)currentNode.getData()).getCost();
            currentNode = currentNode.getNext();
        }
        return summ;
    }

    /*@Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }*/
}