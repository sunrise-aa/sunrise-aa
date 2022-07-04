package 异常处理;

import java.io.*;
import java.util.Scanner;

public class test_12_13 {
    public static void main(String[] args) throws Exception {
        File file =new File("D:\\code\\第六次作业\\src\\异常处理\\score.txt");
        Scanner input1=new Scanner(file);
        Scanner input2=new Scanner(file);
        Scanner input3=new Scanner(file);
      int charcount=0;
      int wordcount=0;
      int linecount=0;
    while(input1.hasNext()){
       String line1= input1.nextLine();
        linecount++;
        charcount+=line1.length();
    }
    while(input2.hasNext()){
        input2.next();
        wordcount++;
    }
    System.out.println(charcount+"Characters");
    System.out.println(wordcount+"words");
    System.out.println(linecount+"lines");
    }

}
