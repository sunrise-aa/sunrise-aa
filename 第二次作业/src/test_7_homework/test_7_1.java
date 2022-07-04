package test_7_homework;

import java.util.Scanner;

public class test_7_1 {
    public static void main(String[] args) {
        System.out.print("Enter the number of studentds");
        Scanner sc= new Scanner(System.in);
        int length=sc.nextInt();
        int[] score=new int[length];
        System.out.printf("Enter %d scores",length);
        for(int i=0;i<length;i++){

            score[i]=sc.nextInt();
        }
        int best=score[0];
        for(int i=0;i<length;i++) {
        if(score[i]>best)
            best=score[i];
        }
        for(int i=0;i<length;i++){
        if(score[i]>=best-40&&score[i]<best-30)
            System.out.printf("Student %d score is %d and grade is D\n",i,score[i]);
        else if(score[i]>=best-30&&score[i]<best-20)
            System.out.printf("Student %d score is %d and grade is C\n",i,score[i]);
        else if(score[i]>=best-20&&score[i]<best-10)
            System.out.printf("Student %d score is %d and grade is B\n",i,score[i]);
        else if(score[i]>=best-10)
            System.out.printf("Student %d score is %d and grade is A\n",i,score[i]);
        }
    }
}
