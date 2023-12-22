public class ChairFactory implements ChairAbstractFactory {

    @Override
    public MagicChair createMagicChair() {
        return new MagicChair(1,"MAGIC",3);
    }

    @Override
    public VictorianChair createVictorianChair() {
        return new VictorianChair(1,"VIKA",3,4);
    }

    @Override
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair(1,"FUNC",3);
    }
}
