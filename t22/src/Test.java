public class Test {
    public static void main(String... args) {
        ChairFactory cf = new ChairFactory();
        Chair magicChair = cf.createMagicChair();
        Chair functionalChair = new FunctionalChair(100, "FUNCTIONALCHAIR", 100);
        Chair victorianChair = new VictorianChair(100, "Вика", 200, 100);

        Client client = new Client();

        client.setChair(magicChair);
        client.sit();

        setChair(functionalChair);
        sit();

        setChair(victorianChair);
        sit();
    }
}
