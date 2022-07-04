package test4_homework;

import java.util.Scanner;

public class test_4_2_2 {
    public static void main(String[] a){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter String s1");
        String s1=input.next();
        System.out.print("Enter String s2");
        String s2=input.next();
       int s3=s1.indexOf(s2);
       if(s3==-1)
           System.out.println(s2+" is not a substring of "+ s1);
       else
           System.out.println(s2+" is a substring of "+ s1);

    }
}
