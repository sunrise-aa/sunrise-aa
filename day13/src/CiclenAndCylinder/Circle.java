package CiclenAndCylinder;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(){
        radius=1;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }

}
