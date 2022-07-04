package test_6_homwwork;

import java.util.Scanner;

public class test_6_37 {
    public static String format(int number,int width) {
        int i=0;
        String str="";
        str=""+number;
        while(number>0)
        {
            number/=10;
            i++;
        }
        int j=width-i;
        if(j<0)
            return str;
       else
           while(j>0) {
               str=0 + ""+str;
               j--;
           }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the number");
        int x=sc.nextInt();
        System.out.print("please enter the wideth");
        int y=sc.nextInt();
        String str=format(x,y);
        System.out.println(str);
    }
}
