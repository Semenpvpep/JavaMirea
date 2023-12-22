public class GermanShepherd extends Dog {
    public GermanShepherd(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " (Немецкая овчарка) лает: Ваф-ваф!");
    }
}
