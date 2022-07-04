package 继承与多态;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

public class test_11_15 {
    public static void main(String[] args) {
        System.out.print("Enter the numbrrer of points:");
        Scanner sc =new Scanner(System.in);
        int numbers=sc.nextInt();
        ArrayList<Double> listX=new ArrayList<>();
        ArrayList<Double> listY=new ArrayList<>();
        System.out.println("Enter the coordinates of the points:");
        for(int i=0;i<numbers;i++){
            listX.add(sc.nextDouble());
            listY.add(sc.nextDouble());
        }
        double area = 0,sumArea = 0;
        for(int i=0;i<listX.size();i++){
            if(i< listY.size()-1)
            area=listX.get(i)*listY.get(i+1)-listY.get(i)*listX.get(i+1);
            else
                area=listX.get(i)*listY.get(0)-listY.get(i)*listX.get(0);
            sumArea+=area/2;
        }
        System.out.println("The total area is "+ Math.abs(sumArea));
    }
}
