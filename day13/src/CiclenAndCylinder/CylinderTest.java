package CiclenAndCylinder;

import java.util.concurrent.Callable;

public class CylinderTest {
    public static void main(String[] args) {
       Cylinder cy1=new Cylinder();
       cy1.setLength(2.1);
       cy1.setRadius(3.5);
        System.out.println("圆柱体积为"+cy1.findVolume());
        System.out.println("底面积为"+cy1.findArea());
    }
}
