public class Main {
    public static void main(String... args) {
        ArrayQueue arrayQueue = new ArrayQueue();
        for (int i = 0; i < 10; i ++){
            arrayQueue.enqueue(i);
        }

        System.out.println("Первый элемент: " + arrayQueue.element());
        System.out.println("Удаление первого элемента: " + arrayQueue.dequeue());
        System.out.println("Текущий размер: " + arrayQueue.size());
        arrayQueue.clear();
        System.out.println("Удалить все, проверка на пустоту: " + arrayQueue.isEmpty() + "\n");


        ArrayQueueADT arrayQueueADT = new ArrayQueueADT();
        for (int i = 10; i > 0; i--){
            arrayQueueADT.enqueue(arrayQueueADT, i);
        }

        System.out.println("Первый элемент: " + arrayQueueADT.element(arrayQueueADT));
        System.out.println("Удаление первого элемента: " + arrayQueueADT.dequeue(arrayQueueADT));
        System.out.println("Текущий размер: " + arrayQueueADT.size(arrayQueueADT));
        arrayQueueADT.clear(arrayQueueADT);
        System.out.println("Удалить все, проверка на пустоту: " + arrayQueueADT.isEmpty(arrayQueueADT) + "\n");


        ArrayQueueModule arrayQueueModule = new ArrayQueueModule();
        for (int i = 20; i > 0; i = i - 2){
            arrayQueueModule.enqueue(i);
        }

        System.out.println("Первый элемент: " + arrayQueueModule.element());
        System.out.println("Удаление первого элемента: " + arrayQueueModule.dequeue());
        System.out.println("Текущий размер: " + arrayQueueModule.size());
        arrayQueueModule.clear();
        System.out.println("Удалить все, проверка на пустоту: " + arrayQueueModule.isEmpty() + "\n");
    }
}