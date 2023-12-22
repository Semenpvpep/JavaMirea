import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hi2");
        al.add("Hi3");

        WaitList<String> wl = new WaitList<>();
        wl.add("Hi");
        wl.add("Hi2");
        wl.add("Hi3");
        System.out.println(wl);
        System.out.println(wl.remove());
        System.out.println(wl);
        System.out.println(wl.isEmpty());
        System.out.println(wl.contains("Hi"));
        System.out.println(wl.containsAll(al));

        System.out.println();

        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        bwl.add("foo");
        bwl.add("foo2");
        bwl.add("bar");
        System.out.println(bwl);

        bwl.add("bar2");

        System.out.println();
        System.out.println(bwl);
        System.out.println(bwl.getCapacity());

        System.out.println();
        bwl = new BoundedWaitList<String>(al);
        System.out.println(bwl.getCapacity());
        bwl.add("bar2");

        System.out.println();

        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);
        uwl.remove(5, false);
        System.out.println(uwl);
        uwl.add(5);
        System.out.println(uwl);
        uwl.moveToBack(6);
        System.out.println(uwl);
    }
}