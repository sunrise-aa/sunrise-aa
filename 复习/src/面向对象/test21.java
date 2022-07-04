package 面向对象;

import java.util.Arrays;

public class test21 {
    public static void main(String[] args) {
        int[] list1={1,2,3};
        int[] list2={1,2,3};
        list2=list1;
        list1[0]=0;
        list1[1]=1;
        list2[2]=2;

        System.out.println(Arrays.toString(list2));
    }

}
