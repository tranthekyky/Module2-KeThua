package triangle;

public class Shape {
    private double side1;
    private double side2;
    private double side3;
    public Shape(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Shape() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

   public double getPerimeter() {
        return side1 + side2 + side3;
   }
   public double getArea() {
        double perimeter = getPerimeter()/2;
        return perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3) ;
   }
    public String toString() {
        return "(" + getSide1() + ", " + getSide2() + ", " + getSide3() + ")" +
                " Area: " + getArea() + ", Perimeter: " + getPerimeter() + " ,";
    }
}
