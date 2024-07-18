package circle;

public class Cylinder extends Circle {
    private double height ;

    Cylinder( double radius, double height, String color ) {
        super( radius, color );
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight( double height ) {
        this.height = height;
    }
    public double getVolume () {
        return pi * getRadius() * getRadius() * height ;
    }
    @Override
    public String toString() {
        return "Cylinder " + super.toString() + " height : " + height ;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder( 10, 10, "red" );
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
