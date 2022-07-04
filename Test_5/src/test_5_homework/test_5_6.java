package test_5_homework;

public class test_5_6 {
    public static void main(String[] args) {
        int i=1,j=20;

        System.out.println("英里      千米         千米      磅");
        while(i<11){
            double x=1.609*i,y=j/1.609;
            System.out.printf("%d         %4.3f     %d      %4.3f\n",i,x,j,y);
            i++;
            j+=5;

        }
    }
}
