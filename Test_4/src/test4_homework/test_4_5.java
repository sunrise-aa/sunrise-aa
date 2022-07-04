package test4_homework;

import java.util.Scanner;

public class test_4_5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of the sides");
        double n=input.nextDouble();
        System.out.print("Enter the side");
        double l=input.nextDouble();
        double s=n*l*l/(4.0*Math.tan(3.1415926/n));
        System.out.println("The area of the polygon is " + s );



    }
}
