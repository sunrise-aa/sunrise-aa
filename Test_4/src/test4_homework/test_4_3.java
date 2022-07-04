package test4_homework;

import java.util.Scanner;

public class test_4_3 {
    public static void main(String[] a){

        System.out.print("输入第1个点的经纬度");
        Scanner input=new Scanner(System.in);
        double x1= input.nextDouble();
        double y1= input.nextDouble();
        x1=Math.toRadians(x1);
        y1=Math.toRadians(y1);
        System.out.print("输入第2个点的经纬度");
        double x2= input.nextDouble();
        double y2= input.nextDouble();
        x2=Math.toRadians(x2);
        y2=Math.toRadians(y2);
        System.out.print("输入第3个点的经纬度");
        double x3= input.nextDouble();
        double y3= input.nextDouble();
        x3=Math.toRadians(x3);
        y3=Math.toRadians(y3);
        System.out.print("输入第4个点的经纬度");
        double x4= input.nextDouble();
        double y4= input.nextDouble();
        x4=Math.toRadians(x4);
        y4=Math.toRadians(y4);
        double a1=6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double d4=6371.01 * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));
        double b2=6371.01 * Math.acos(Math.sin(x3) * Math.sin(x2) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        double c3=6371.01 * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
        double e5=6371.01 * Math.acos(Math.sin(x2) * Math.sin(x4) + Math.cos(x2) * Math.cos(x4) * Math.cos(y2 - y4));
        double s1=(a1+e5+d4)/2.0;
        double s2=(b2+c3+e5)/2.0;
        double area1=Math.sqrt(s1*(s1-a1)*(s1-e5)*(s1-d4));
        double area2=Math.sqrt(s2*(s2-b2)*(s2-e5)*(s1-c3));
        double total_area=area1+area2;
        System.out.println("the total area is "+ total_area);

    }
}
