package 面向对象;

public class Fun {
    public static int SLOW=1;
    public static int MEDIUM=2;
    public static int FAST=3;
    private int spped;
    private boolean on;
    private double radius;
    private String color;
    public int getSpped() {
        return spped;
    }

    public void setSpped(int spped) {
        this.spped = spped;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Fun(){

    }
    public String tostring(){
        if(this.on==false)
          return "Fun is off";
        else
            return "spped "+spped+" color "+color+" radius "+radius;

    }
}
class test324 {
    public static void main(String[] args) {
        Fun funn1=new Fun();
        funn1.setColor("Yellow");
funn1.setSpped(Fun.FAST);
        funn1.setOn(true);
        funn1.setRadius(2);
        System.out.println(funn1.tostring());

    }
}