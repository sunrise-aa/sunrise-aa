package test_8_homework;

import java.util.Scanner;

public class test_8_1 {
    public static double sunColum(double[][] m,int columIndex){
        int i=0;
        double sum=0;
        for(i=0;i<m.length;i++){
            sum+=m[i][columIndex];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-4 matrix row by row");
        Scanner sc=new Scanner(System.in);
       double[][] numbers=new double[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++)
            numbers[i][j]=sc.nextDouble();
        }
        double sum1=sunColum(numbers,0);
        double sum2=sunColum(numbers,1);
        double sum3=sunColum(numbers,2);
        double sum4=sunColum(numbers,3);
        System.out.println("sum of the elements at column 0 is "+sum1);
        System.out.println("sum of the elements at column 1 is "+sum2);
        System.out.println("sum of the elements at column 2 is "+sum3);
        System.out.println("sum of the elements at column 4 is "+sum4);
    }
}
