package 继承与多态;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_12 {
    public static void main(String[] args) {
        System.out.println("请输入五个数字");
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            list.add(sc.nextDouble());
        double  sum1 = sum(list);
        System.out.println("这个列表和为" + sum1);
    }

    public static double sum(ArrayList<Double> list){
        double sum1=0;
        for(int i=0;i<list.size();i++)
            sum1+= list.get(i);

        return sum1;
    }
}