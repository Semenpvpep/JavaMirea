public class ArrayQueueModule {
    private static int size;
    private static int head;
    private static int tail;
    private static Object[] elements = new Object[10];

    static void fixCapacity(int capacity)
    {
        int len = elements.length;
        if (capacity > len)
        {
            Object[] newElements = new Object[elements.length * 2];
            int i = 0;
            while (tail != head)
            {
                newElements[i] = elements[head];
                head = (head + 1) % len;
                i++;
            }
            head = 0;
            tail = len - 1;
            elements = newElements;
        }
    }

    public void enqueue(Object element)
    {
        fixCapacity(size + 2);
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    public Object element()
    {
        return elements[head];
    }

    public Object dequeue()
    {
        Object ret = element();
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return ret;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return (size == 0);
    }

    public void clear()
    {
        head = 0;
        tail = 0;
        size = 0;
    }
}