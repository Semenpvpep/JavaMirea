import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;
    public BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public BoundedWaitList(Collection<E> e){
        super(e);
        this.capacity = e.size();
    }
    public int getCapacity(){
        return capacity;
    }
    @Override
    public void add(E element){
        if (content.size() == capacity){
            return;
        }
        content.add(element);
    }
}