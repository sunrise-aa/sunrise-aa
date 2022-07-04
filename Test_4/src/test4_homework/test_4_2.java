package test4_homework;

import java.util.Scanner;

public class test_4_2 {
    public static void main(String[] a){
        System.out.print("Enter point 1(latitude and longitude) in the degress: ");
        Scanner input=new Scanner(System.in);
        double x1= input.nextDouble();
        double y1= input.nextDouble();
        x1=Math.toRadians(x1);
        y1=Math.toRadians(y1);
        System.out.print("Enter point 2(latitude and longitude) in the degress: ");
        double x2= input.nextDouble();
        double y2= input.nextDouble();
        x2=Math.toRadians(x2);
        y2=Math.toRadians(y2);
        double d=6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between the two points is "+d+"Km");
    }
}
