package test_8_homework;

import java.util.Scanner;

public class test_8_29 {
    public static boolean equals(int[][] list1,int[][] list2){
        if(list1.length!=list2.length)
            return false;
        else if(list1[0].length!=list2[0].length)
            return false;
        int i=0,j=0,m=0,n=0;
        for(i=0;i<list1.length;i++){
        for(j=0;j<list1[0].length;j++) {
            int t=0;
            for (m = 0; m < list1.length; m++)
                for (n = 0; n < list1[0].length; n++) {
                    if (list1[i][j] == list2[m][n])
                        t=1;
                }
            if(t==0)
                return false;
        }
        }

        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the list1 :");
        Scanner sc=new Scanner(System.in);

        int[][] list1=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                list1[i][j]=sc.nextInt();
        }
        System.out.print("Enter the list2 :");
        int[][] list2=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                list2[i][j]=sc.nextInt();
        }
        if(equals(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }
        else System.out.println("Two lists are not strctly identical ");
    }

}
