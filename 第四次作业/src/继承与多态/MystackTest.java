package 继承与多态;

import java.util.Scanner;

public class MystackTest {
    public static void main(String[] args) {
        System.out.println("请输入5个字符串");
        Mystack mystack=new Mystack();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            String string1=sc.next();
            mystack.add(string1);
        }
     for(int i=5;i>0;i--)
         System.out.print(mystack.get(i-1)+" ");


    }
}
