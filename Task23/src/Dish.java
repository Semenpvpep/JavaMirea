public class Dish {
    int cost;
    String name;
    String description;

    public Dish(String name, String description, int cost){
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public Dish(String name, String description){
        this.cost = 0;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString(){
        return "Блюдо: " + getName() + "; Описание: " + getDescription() + "; Цена: " + getCost() + "\n";
    }
}