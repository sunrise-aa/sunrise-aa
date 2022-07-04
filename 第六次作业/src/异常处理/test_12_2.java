package 异常处理;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test_12_2 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner sc=new Scanner(System.in);
        int num1=0;
        int num2=0;
        int i=0;
        boolean operate=true;
        try {
            num1 = sc.nextInt();
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("您输入的不是整数呢！请重新输入");
            operate=false;
        }
       if(operate)
        System.out.println("和为" + (num1 + num2));

    }

}

