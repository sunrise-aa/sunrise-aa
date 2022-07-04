package test_7_homework;

import java.util.Scanner;

public class test_7_11 {
    public static double mean(double[] x){
        int i=0;
        double m=0;
        for(i=0;i<x.length;i++){
            m+=x[i]/x.length;
        }
        return m;
    }

    public static double deviation(double[] x){
        int i=0;
        double m=0;
        double sum=0;
        for(i=0;i<x.length;i++){
            m+=(double)x[i]/x.length;
        }
    for(i=0;i<x.length;i++)
        sum+=(x[i]-m)*(x[i]-m)/(x.length-1);
    double d=Math.sqrt(sum);

return d;

    }
    public static void main(String[] args) {
        final int n=10;
        double[] numbers=new double[n];
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter %d numbers",n);
        for(int i=0;i<n;i++){

            numbers[i]=sc.nextDouble();
        }
        double m=mean(numbers);
        double d=deviation(numbers);
        System.out.println("The mean is"+ m);
        System.out.println("The standard deviation is"+d);
    }
}
