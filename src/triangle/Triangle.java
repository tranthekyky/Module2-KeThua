package triangle;

public class Triangle extends Shape{
    public String color ;
    public Triangle (double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return "Triangle" +  super.toString() + " color = " + color  ;
    }
}
