package test_7_homework;
import java.util.Scanner;
public class test_7_27 {
    public static boolean equals(int[] list1,int[] list2){
        if(list1.length!=list2.length)
            return false;
        int i=0,j=0;
        for(i=0;i<list1.length;i++){
            int t=0;
            for(j=0;j<list1.length;j++) {
                if (list1[i] == list2[j])
                t=1;
            }
            if(t==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter the list1 and contents:");
        Scanner sc=new Scanner(System.in);
        int l1=sc.nextInt();
        int[] list1=new int[l1];
        for(int i=0;i<l1;i++)
            list1[i]=sc.nextInt();
        System.out.print("Enter the list2 and contents:");
        int l2=sc.nextInt();
        int[] list2=new int[l2];
        for(int i=0;i<l2;i++)
            list2[i]=sc.nextInt();
        if(equals(list1,list2)){
            System.out.println("Two lists are strictly identical");
        }
        else System.out.println("Two lists are not strctly identical ");
    }
}
