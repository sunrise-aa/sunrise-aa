package test_6_homwwork;

import java.util.Scanner;

public class test_6_35 {
    public static double area(double side){
       double s=5*side*side/4.0/Math.tan(3.1415926/5);
       return s;
    }

    public static void main(String[] args) {
        System.out.print("Enter the side");
        Scanner sc=new Scanner(System.in);
        double side= sc.nextDouble();
        double s=area(side);
        System.out.println("The area of the pentagon is "+s);

    }


}
