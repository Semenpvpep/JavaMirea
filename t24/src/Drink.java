public class Drink extends MenuItem implements Alcoholable{

    final double alcoholVol;
    final DrinkTypeEnum type;

    public Drink(double alcoholVol, DrinkTypeEnum type, int cost, String name, String description) {
        super(cost, name, description);
        this.alcoholVol = alcoholVol;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return (alcoholVol > 0);
    }

    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}