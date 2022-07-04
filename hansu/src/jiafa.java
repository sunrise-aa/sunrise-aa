import java.util.Scanner;

public class jiafa {

    public static int add(int x, int y) {
        return x + y;
    }

    public static void main(String[] a) {


        System.out.println(add(1, 2));

        int[] b = new int[10];
        Scanner input = new Scanner(System.in);
        int i = 0;
        for (i = 0; i < 10; i++) {


            b[i] = input.nextInt();
        }


        int j = 0;
        for (i = 0; i < 9; i++){
            for(j=0;j<9-i;j++){
                if(b[j]>b[j+1]) {
                    int temp = b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }

        }for(i=0;i<10;i++)
System.out.print(" "+b[i]);
    }
}