import java.util.Scanner;

class area {
   static final double pi=3.14159256;
    public static void main(String[] a){

        Scanner sc=new Scanner(System.in);
        double r= sc.nextDouble();

        double s=pi*r*r;
        System.out.println("The area of the circle is"+s);

    }
}
