package 异常处理;

import java.util.Random;
import java.util.Scanner;

public class test_12_3 {
    public static void main(String[] args) {
        double[] array1=new double[100];
        for(int i=0;i<100;i++){
            array1[i]= (int )(Math.random()*10000);
        }
        System.out.println("请输入一个整数的下标");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        try{
            System.out.println("该数据为"+array1[num1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }
}
