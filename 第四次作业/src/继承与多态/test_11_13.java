package 继承与多态;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_13 {
    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(sc.nextInt());
        removeDuplicate(list);
        System.out.println(list.toString());
        
    }
    public static void removeDuplicate(ArrayList<Integer> list) {
        int i = 0;
        for (i = 0; i < list.size(); i++) {
            while (list.indexOf(list.get(i)) != list.lastIndexOf(list.get(i))) {
                list.remove(list.get(i));

            }

        }
    }
    }
