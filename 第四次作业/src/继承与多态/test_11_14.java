package 继承与多态;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_14 {
    public static void main(String[] args) {
        System.out.print("Enter five integers for list1:");
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++)
            list1.add(sc.nextInt());
        System.out.print("Enter five integers for list2:");
        for(int i=0;i<5;i++)
            list2.add(sc.nextInt() );
        ArrayList<Integer> list3=union(list1,list2);
        System.out.print("The combined list is"+list3.toString());
    }
public static ArrayList<Integer> union(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=0;i<list1.size();i++)
            list3.add(list1.get(i));
        for(int i=list1.size();i<list1.size()+list2.size();i++)
            list3.add(list2.get(i-list1.size()));
        return list3;
}
}
