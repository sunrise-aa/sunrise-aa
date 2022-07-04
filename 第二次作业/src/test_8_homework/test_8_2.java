package test_8_homework;

import java.util.Scanner;

public class test_8_2 {
    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-4 matrix row by row");
        Scanner sc = new Scanner(System.in);
        double[][] numbers = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                numbers[i][j] = sc.nextDouble();
        }
        double sum1 = sumMajorDiagonal(numbers);
        System.out.println("sum of the elements int the major diagonal is " + sum1);
    }
}