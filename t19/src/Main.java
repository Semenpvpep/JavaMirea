import java.util.ArrayList;

public class Main {
    public static <E> ArrayList<E> arrayToList(E[] arr){
        ArrayList<E> l = new ArrayList<>(arr.length);
        for (E element : arr) {
            l.add(element);
        }
        return l;
    }

    public static void main(String... args){
        String[] a = new String[]{"Hello, ", " my dear ", "friend!"};
        Integer[] b = new Integer[]{1, 2, 3};
        ArrayList<String> l = arrayToList(a);
        ArrayList<Integer> m = arrayToList(b);
        System.out.println(l);
        System.out.println(m);
    }
}