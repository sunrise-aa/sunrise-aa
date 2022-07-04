package test_6_homwwork;

import java.util.Scanner;

public class test_6_39 {
    public static boolean LeftOfTheLine(double x0,double y0,double x1,double y1,double x2,double y2){

        double k=(y1-y0)/(x1-x0);
        double b=y0-k*x0;
        if(k*x2+b<y2)
            return true;
        else
            return false;
    }
    public static boolean onTheSameLine(double x0,double y0,double x1,double y1,double x2,double y2){
        double k=(y1-y0)/(x1-x0);
        double b=y0-k*x0;
        if(x2*k+b==y2)
            return true;
        else
            return false;

    }
    public static boolean onTheLineSegement(double x0,double y0,double x1,double y1,double x2,double y2){


        if((x2>x0&&x2<x1)||x2<x0&&x2>x1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter three points for p1,p1,and p2: ");
        double x0=sc.nextDouble();
        double y0=sc.nextDouble();
        double x1=sc.nextDouble();
        double y1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y2=sc.nextDouble();
        boolean c1=LeftOfTheLine(x0,y0,x1,y1,x2,y2);
        boolean c2=onTheSameLine(x0,y0,x1,y1,x2,y2);
        boolean c3=onTheLineSegement(x0,y0,x1,y1,x2,y2);
        if(c1==true&&c2==false)
            System.out.printf("(%.1f ,%.1f) is on the left of the line from(%.1f ,%.1f) to (%.1f ,%.1f)",x2,y2,x0,y0,x1,y1);
        else if(c1==false&&c2==false)
            System.out.printf("(%.1f ,%.1f) is on the right of the line from(%.1f ,%.1f) to (%.1f ,%.1f)",x2,y2,x0,y0,x1,y1);
        else if(c1==false&&c3==false)
            System.out.printf("(%.1f ,%.1f) is on the same line from(%.1f ,%.1f) to (%.1f ,%.1f)",x2,y2,x0,y0,x1,y1);
         else if(c1==false&&c3==true)
            System.out.printf("(%.1f ,%.1f) is on the line  segment from(%.1f ,%.1f) to (%.1f ,%.1f)",x2,y2,x0,y0,x1,y1);
    }
}
