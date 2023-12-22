public class VictorianChair implements Chair{
    int height;
    String name;
    int area;
    int age;

    public VictorianChair(int height, String name, int area, int age){
        this.height = height;
        this.area = area;
        this.name = name;
        this.age = age;
    }


    public int getAge(){
        return age;
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

    @Override
    public String toString(){
        return "Стул викторианский " + this.getNameChair() + " с высотой спинки " + this.getHeigh() + " имеет площадь сидения " + this.getArea() + " и ему (лет) " + this.getAge();
    }
}