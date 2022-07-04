package 继承与多态;

import java.util.ArrayList;
import java.util.Scanner;

public class test_11_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size n:");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];
        int randomNumber;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                randomNumber = (int) (Math.random() * 10);
                if (randomNumber % 2 == 0)
                    matrix[i][j] = 0;
                else matrix[i][j] = 1;

            }
        }
        System.out.println("The radom array is ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int m=0;
            for (int j = 0; j < size; j++) {

                if (matrix[i][j] == 1) {
                    m++;
                }
            }
            row.add(m);
        }
        for (int i = 0; i < size; i++) {
            int m=0;
            for (int j = 0; j < size; j++) {
                if (matrix[j][i] == 1) {
                    m++;
                }
            }
            column.add(m);
        }
       if(row.indexOf(java.util.Collections.max(row))!=row.lastIndexOf(java.util.Collections.max(row)))
        System.out.println("The largesst row index: "+row.indexOf(java.util.Collections.max(row))+" "+row.lastIndexOf(java.util.Collections.max(row)));
        else
           System.out.println("The largesst row index: "+row.indexOf(java.util.Collections.max(row)));
        if(column.indexOf(java.util.Collections.max(column))!=column.lastIndexOf(java.util.Collections.max(column)))
       System.out.println("The largesst column index: "+column.indexOf(java.util.Collections.max(column))+column.lastIndexOf(java.util.Collections.max(column)));
        else
            System.out.println("The largesst column index: "+column.indexOf(java.util.Collections.max(column)));
    }
}