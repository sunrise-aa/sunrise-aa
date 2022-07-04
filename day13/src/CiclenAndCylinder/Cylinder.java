package CiclenAndCylinder;

public class Cylinder extends Circle{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public Cylinder(){
        length=1;
    }
    public double findVolume(){
        return findArea()*getLength();
    }
}
