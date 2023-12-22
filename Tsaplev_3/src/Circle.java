public class Circle extends Shape {
    protected double radius;
    Circle() {

    }
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*radius*3.14;
    }
    @Override
    public double getPerimeter() {
        return radius*2*3.14;
    }
    @Override
    public String toString() {
        return "Area of Circle = " + getArea() + "; Perimeter = " + getPerimeter();
    }
}
