public class ArrayQueueADT {
    private int size;
    private int head;
    private int tail;
    private Object[] elements = new Object[10];

    static void fixCapacity(ArrayQueueADT queue, int capacity)
    {
        int len = queue.elements.length;
        if (capacity > len)
        {
            Object[] newElements = new Object[queue.elements.length * 2];
            int i = 0;
            while (queue.tail!=queue.head)
            {
                newElements[i] = queue.elements[queue.head];
                queue.head = (queue.head + 1) % len;
                i++;
            }
            queue.head = 0;
            queue.tail = len - 1;
            queue.elements = newElements;
        }
    }

    public void enqueue(ArrayQueueADT queue, Object element)
    {
        fixCapacity(queue, queue.size + 2);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }

    public Object element(ArrayQueueADT queue)
    {
        return queue.elements[queue.head];
    }

    public Object dequeue(ArrayQueueADT queue)
    {
        Object ret = element(queue);
        queue.elements[queue.head] = null;
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return ret;
    }

    public int size(ArrayQueueADT queue)
    {
        return queue.size;
    }

    public boolean isEmpty(ArrayQueueADT queue)
    {
        return (queue.size == 0);
    }

    public void clear(ArrayQueueADT queue)
    {
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}