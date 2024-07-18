package point;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }
    public float [] getXYZ () {
        return new float[]{getX(), getY(), this.z};
    }

    @Override
    public String toString() {
        return "( " + getX() + ", " + getY() + ", " + getZ() + ")";
    }

    public static void main(String[] args) {
        Point3D p2 = new Point3D(0,1, 4);
        System.out.println(p2);
//        p2.setXY(p2.getX(),p2.getY()) ;
//        System.out.println(p2);
        p2.getXYZ() ;
        System.out.println(Arrays.toString(p2.getXY()));
        p2.setXYZ(3,4,6);
        System.out.println(Arrays.toString(p2.getXY()));
        System.out.println(p2.toString());


    }
}
