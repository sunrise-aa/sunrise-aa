package test_5_homework;

public class test_5_5 {
    public static void main(String[] args) {
        int i=1,j=20;

        System.out.println("千克      磅         磅      千克");
        while(i<199){
            double x=2.2*i,y=j/2.2;
            System.out.printf("%d         %4.2f     %d      %4.2f\n",i,x,j,y);
            i+=2;
            j+=5;

        }
    }
}
