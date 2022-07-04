package 面向对象;

import java.util.Arrays;
import java.util.Scanner;

public class test_3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(isSorted(a));
    }

    public static boolean isSorted(int[] array) {
        int[] array1=new int[array.length];
       System.arraycopy(array,0,array1,0,array.length);
        Arrays.sort(array1);
        for(int i=0;i<array.length;i++) {
            if (array[i] != array1[i])
                return false;
        }
        return true;
    }
}