public class FunctionalChair implements Chair{
    int height;
    String name;
    int area;

    public FunctionalChair(int height, String name, int area){
        this.height = height;
        this.area = area;
        this.name = name;
    }
    public int getHeigh() {
        return height;
    }

    public String getNameChair() {
        return name;
    }

    public int getArea() {
        return area;
    }

    public static int sum(int a, int b) {
        return a+b;
    }
    public String toString(){
        return "Стул функциональный " + this.getNameChair() + " с высотой спинки " + this.getHeigh() + " имеет площадь сидения " + this.getArea();
    }
}