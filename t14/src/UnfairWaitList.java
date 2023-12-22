import java.util.concurrent.ConcurrentLinkedDeque;

public class UnfairWaitList<E> extends WaitList<E>{
    protected ConcurrentLinkedDeque<E> removedContent = new ConcurrentLinkedDeque<>();
    public UnfairWaitList(){}

    @Override
    public void add(E element){
        if (removedContent.contains(element)){return;}
        content.add(element);
    }
    public void remove(E element, boolean is_add) {
        boolean removed = false;
        for (int i =0; i < content.size(); i++) {
            E el = content.remove();
            if (el == element) {
                if (removed || is_add) {
                    continue;
                }
                removedContent.add(el);
            } else {
                content.add(el);
            }
        }

    }
    public void moveToBack(E element){
        remove(element, true);
        content.add(element);
    }
}