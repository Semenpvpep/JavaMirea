import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;

public class  WaitList<E> implements IWaitList<E> {
    protected ConcurrentLinkedDeque<E> content = new ConcurrentLinkedDeque<>();
    public WaitList(){}
    public WaitList(Collection c){
        content.addAll(c);
    }
    @Override
    public void add(E element){
        content.add(element);
    }
    @Override
    public E remove(){
        return content.remove();
    }
    @Override
    public boolean contains(E element){
        return content.contains(element);
    }
    @Override
    public boolean containsAll(Collection c){
        return content.containsAll(c);
    }
    @Override
    public boolean isEmpty(){
        return content.isEmpty();
    }
    @Override
    public String toString() {
        return "WaitList{" +
                "components=" + content +
                '}';
    }

}