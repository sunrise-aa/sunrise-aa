package 继承与多态;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入5个数字");
        int[] array= new int[5];
        for(int i=0;i<5;i++)
      list.add(sc.nextInt());
        sort(list);
        System.out.println(list);


    }
    public static void sort(ArrayList<Integer> list){
    
        for (int i = 0; i < list.size() - 1; i++)
        for (int j = 0; j < list.size() - 1 - i; j++)
            if (list.get(j) > list.get(j + 1)) {
                int temp1 = list.get(j);
                int temp2 = list.get(j + 1);
                list.set(j, temp2);
                list.set(j + 1, temp1);
            }
    }
    }
