package test_7_homework;

import java.util.Scanner;

public class test_7_25 {
    public static int solveQuadratic(double[] eqn,double[] toots) {
        double m = eqn[1]*eqn[1] - 4 * eqn[0] * eqn[2];
        toots[0] = (-eqn[1] + Math.sqrt(m)) / 2 / eqn[0];
        toots[1] = (-eqn[1] - Math.sqrt(m)) / 2 / eqn[0];
        if (m > 0) {
            return 2;
        } else if (m == 0) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        double[] eqn = new double[3];
        double[] toots=new double[2];
        System.out.print("请输入系数");
    Scanner sc=new Scanner(System.in);
    eqn[0]=sc.nextDouble();
    eqn[1]=sc.nextDouble();
    eqn[2]=sc.nextDouble();
    int j=solveQuadratic(eqn,toots);
        System.out.printf("实根个数为%d\n",j);
       if(j==2)
           System.out.println("第一个根为 " + toots + "\n第二个根为" + toots[1]);
       else if(j==1)
           System.out.println("有唯一的一个根为" + toots[0]);
       else
           System.out.println("无实根");
    }
}