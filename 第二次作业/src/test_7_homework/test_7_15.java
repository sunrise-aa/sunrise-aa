package test_7_homework;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class test_7_15 {
    public static int[] eliminateDuplicates(int[] list) {
        int[] list1 = new int[list.length];
        int i = 0, j = 0;
        int c = 0;

        for (i = 0; i < list.length; i++) {
            int z = 0;
            for (j = 0; j < list.length; j++) {
                if(list[i]==0)
                    continue;
                if (list1[j] == list[i]) {
                    break;
                }
                z++;
            }
            if (z == 10) {
                list1[c] = list[i];
                c++;
            }
        }
        int d=c+1;
        int[] list2 = new int[d];
        System.arraycopy(list1,0,list2,0,d);
        return list2;
    }
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers:");
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = eliminateDuplicates(a);
        System.out.print("The distinct numbers are"+ java.util.Arrays.toString(b));
        }
    }
