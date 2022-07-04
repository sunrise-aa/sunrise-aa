package 异常处理;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class test_12_14 {
    public static void main(String[] args) throws Exception {
        File file=new File("D:\\code\\第六次作业\\src\\异常处理\\fenshu");
        Scanner input=new Scanner(file);
        ArrayList<String> array=new ArrayList<>();
        double  sum=0,avg=0;
        int i=0;
        while(input.hasNext()){
            array.add(input.next());

            sum+=(double) (array.get(i).charAt(0)-'0')/(double) (array.get(i).charAt(2)-'0');
            i++;
        }
        System.out.println("和为"+sum);
        System.out.println("平均值为"+sum/ array.size());
    }
}


