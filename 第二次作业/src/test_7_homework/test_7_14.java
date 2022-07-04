package test_7_homework;

import java.util.Scanner;

public class test_7_14 {
    public static int gcd(int[] numbers){
        int i=0,j=0,a=0;
        int min=numbers[0];
        for(i=1;i<numbers.length;i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        for(i=1;i<=min;i++) {
            int z=0;
            for (j=0;j<numbers.length;j++) {
                if(numbers[j]%i==0)
                    z++;

                if (numbers[j] % i != 0)
                    break;
            }
            if(z==numbers.length)
                a=i;

        }
            return a;
    }

    public static void main(String[] args) {
        int[] numbers=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("pleae enter five number:");
        for(int i=0;i<5;i++)
            numbers[i]=sc.nextInt();
        int a=gcd(numbers);
        System.out.println("The greast common divisor is "+a);
    }
}
