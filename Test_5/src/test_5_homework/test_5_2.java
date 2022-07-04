package test_5_homework;

import java.util.Scanner;

public class test_5_2 {
    public static void main(String[] args) {
        int coreectNumber=0;
        int i=0;
        long beginTime=System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        while(i<5)
        {
            int n1=(int)(Math.random()*15);
            int n2=(int)(Math.random()*15);
            System.out.print(n1+"+"+n2+" = ?");
            int anwser=sc.nextInt();
            if(n1+n2==anwser) {
                System.out.println(" Correct!!!");
                coreectNumber++;
            }
            else
                System.out.println("   Wrong!!! The result should be "+ (n1+n2));
            i++;
        }
        Long testTime=System.currentTimeMillis()-beginTime;
        System.out.println("the correct number is "+ coreectNumber+
                "\n"+"the test time is" +testTime);
    }
}
