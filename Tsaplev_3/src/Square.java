public class Square extends Rectangle {
    protected double side;
    Square(double side) {
        this.side = side;
    }
    Square(double side,String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side) {
        this.side = side;
    }
    @Override
    public void setLength(double side) {
        this.side = side;
    }
    @Override
    public String toString() {
        return "Area of Square = " + getArea() + "; Perimeter = " + getPerimeter();
    }
}
