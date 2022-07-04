package 异常处理;

import java.util.Scanner;

public class test_12_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String num1=sc.next();
        String instructionCharacter=sc.next();
        String num2=sc.next();

        double numbers1=0;
        double numbers2=0;
        boolean flag=true;
        try{
            numbers1=Double.parseDouble(num1);

        } catch (NumberFormatException e) {
            System.out.println("Wronf Input:"+num1);
            flag=false;
        }
        try{
            numbers2=Double.parseDouble(num2);
        }catch (NumberFormatException e){
            System.out.println("Wrong Input:"+num2);
            flag=false;
        }
        int count1=0;
        for(int i=0;i<num1.length();i++){
            if((int)(num1.charAt(i))<48||(int)(num1.charAt(i))>57)
                break;
            count1++;
        }
        if(count1!=num1.length()) {
            System.out.println("Wronf Input:" + num1);
            flag=false;
        }
        else
            numbers1=Double.parseDouble(num1);
        int count2=0;
        for(int i=0;i<num2.length();i++){
            if((int)(num2.charAt(i))<48||(int)(num2.charAt(i))>57)
                break;
            count2++;
        }
        if(count2!=num2.length()) {
            System.out.println("Wronf Input:" + num2);
            flag=false;
        }
        else
            numbers2=Double.parseDouble(num2);

        if(flag) {
            switch (instructionCharacter) {
                case "+":
                    System.out.println(numbers1 + " " + instructionCharacter + " " + numbers2 + " =" + (numbers1 + numbers2));
                    break;
                case "-":
                    System.out.println(numbers1 + " " + instructionCharacter + " " + numbers2 + " =" + (numbers1 - numbers2));
                    break;
                default:
                    System.out.println("输入错误");
                    break;

            }
        }
        else
            System.out.println();

    }
}
