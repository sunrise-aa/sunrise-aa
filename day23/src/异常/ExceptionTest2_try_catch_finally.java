package 异常;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.FindException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2_try_catch_finally {
    public static void main(String[] args) {
        try {
            methold2();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void test1(){
        try{
                Scanner sc=new Scanner(System.in);
                int num1=sc.nextInt();
                System.out.println(num1);
                sc.close();
        }catch(InputMismatchException e){
            System.out.println("程序没问题你的问题");
            System.out.println(e.getCause());

            }finally{
            System.out.println("建议重启呢");
        }
    }
    public static void methold1()throws FileNotFoundException, IOException {
        File file=new File("葵花宝典");
        FileInputStream fis=new FileInputStream(file);
        int data=fis.read();
        while(data!=-1){
            System.out.println((char)data);
            data=fis.read();
        }
        fis.close();
    }
    public static void methold2()throws IOException{
        methold1();
    }
    public static void methold3(){
        try{
            methold2();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
