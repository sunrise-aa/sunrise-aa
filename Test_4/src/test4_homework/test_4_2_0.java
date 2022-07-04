package test4_homework;

import java.util.Scanner;

public class test_4_2_0 {
    public static void main(String[] a){

        System.out.print("请输入一个字符串");
        Scanner input=new Scanner(System.in);
        String b=input.next();
        System.out.println("长度为 "+b.length()+"第1个字符为"+ b.charAt(0));
    }
}
