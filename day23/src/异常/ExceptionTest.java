package 异常;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/*
*异常体系结构
* java.lang.Throwable
*    |----java.lang.Error:一般不编写针对性的代码处理。
*    |----Java.lang.Exception:可以进行异常的处理
*       |----编译时异常(checked)
*              |----IOException
*                 |--FileNotFoundException
*              |ClassNotFoundException
*
*       |----运行时异常(Unchecked)
*              |--Nul1PointerException
*              |-- ArrayIndexOutOfBoundsException
*              |-- ClassCastException
*              |-- NumberFormatException
*              |--InputMismatchException
*              |--ArithmaticException
*
*
 */
public class ExceptionTest {
    public static void main(String[] args) {
test6();
    }
   //1.Nul1PointerExceptionmain
    public static void test1 () {
           int[] array1 = null;
           System.out.println(array1[0]);
           //
        String s="123";
        s=null;
        System.out.println(s.charAt(0));
       }

       //2.ArrayIndexOutOfBoundsException
    public static void test2(){
        int[] a=new int[3];
        System.out.println(a[3]);
    }
    //3.ClassCastException
    public static void test3(){
        Object obj=new Date();
        String str=(String) obj;
    }
    //4.NumberFormatException
    public static void test4(){
        String str="123";
        int num=Integer.parseInt(str);//此时可以运行
        String str1="abc";
        int num1=Integer.parseInt(str1);
    }
    //5.InputMismatchException
    public static void test5(){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println(num1);
        sc.close();
    }
    //6.ArithmaticException
    public static void test6(){
        System.out.println(6/0);
    }
    //********以上是运行时异常**********



    //********以下是编译时异常*******
  /*  public static void test7(){
        File file=new File("HEllo.txt");
        FileInputStream fis=new FileInputStream(file);
        int data=fis.read();
        while(data!=-1){
            System.out.println(data);
            data=fis.read();
        }
        fis.close();
    }*/
    }
