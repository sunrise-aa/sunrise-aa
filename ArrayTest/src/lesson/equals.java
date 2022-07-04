package lesson;

import java.util.Arrays;

public class equals {
    public static void main(String[] args) {
        int[] arry1=new int[]{1,2,3,4};
        int[] arry2=new int[]{1,3,2,4};
        boolean a=Arrays.equals(arry1,arry2);
        System.out.println(a);
        System.out.println(Arrays.toString(arry1));
        Arrays.fill(arry1,2);
        System.out.println(Arrays.toString(arry1));
        Arrays.sort(arry2);
        System.out.println(Arrays.toString(arry2));
        int[] arr3=new int[]{1,5,2,7,3,9,4,8};
        Arrays.sort(arr3);
        int c=Arrays.binarySearch(arr3,5);
        System.out.println(c);
    }

}
