public class Ball {
    private double r;
    private String color;
    public Ball() {
        r = 1;
        color = "White";
    }
    public Ball(int r, String color) {
        this.r = r;
        this.color = color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setR(double r){
        this.r = r;
    }
    public String getColor() {
        return color;
    }
    public double getR() {
        return r;
    }
    public String toString() {
        return "Color: " + color + ", radius: " + r;
    }
}
