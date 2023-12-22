public class MagicChair implements Chair {
    int height;
    String name;
    int area;

    public MagicChair(int height, String name, int area){
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
    public void doMagic() {
        System.out.println("\nMAGIA!!!\n");
    }

    public String toString(){
        return "Стул магический " + this.getNameChair() + " с высотой спинки " + this.getHeigh() + " имеет площадь сидения " + this.getArea();
    }
}