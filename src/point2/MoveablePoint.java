package point2;

public class MoveablePoint extends Point {
    private float xSpeed ;
    private float ySpeed ;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed = ( " + xSpeed + ", " + ySpeed + " )";
    }
    public MoveablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint mP = new MoveablePoint(0, 0 );
        mP.setSpeed(15, 10);
        mP.setX(2);
        mP.setY(3);
        System.out.println(mP.toString());
        mP.move();
        System.out.println(mP.toString());
        System.out.println( mP.getX());
        System.out.println(mP.getY());
    }
}
