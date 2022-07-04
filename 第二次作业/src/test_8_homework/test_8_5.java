package test_8_homework;

import java.sql.SQLOutput;
import java.util.Scanner;

public class test_8_5 {
    public static double[][] addMatix(double[][] a,double[][] b){
        double[][] sum=new double[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++)
            sum[i][j]=a[i][j]+b[i][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.print("Enter matrix1");
        Scanner sc=new Scanner(System.in);
        double[][] a=new double[3][3];
        int i=0,j=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                a[i][j]=sc.nextDouble();
            }
        }
        double[][] b=new double[3][3];
        System.out.print("Enter matrix2");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                b[i][j]=sc.nextDouble();
            }
        }
        double[][] sum=addMatix(a,b);
        System.out.println("The matrices are added as follows");
        int z=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(a[i][j]+" ");
            for(z=0;z<3;z++) {
                if(i==1&&z==0)
                    System.out.print("+");
                else System.out.print(" ");
            }
            for(j=0;j<3;j++)
                System.out.print(b[i][j]+" ");
            for(z=0;z<3;z++) {
                if(i==1&&z==0)
                    System.out.print("=");
                else System.out.print(" ");
            }
            for(j=0;j<3;j++)
                System.out.print(sum[i][j]+" ");
            System.out.println();

        }
    }
}
