package test_7_homework;

public class test_7_7 {
    public static void main(String[] args) {
        int[] numbers=new int[100];
        int i=0;
        for(i=0;i<100;i++)
        {

            numbers[i]=(int)(Math.random()*10);

        }
        int[] count=new int[10];
        for(i=0;i<100;i++){
           for(int j=0;j<10;j++) {
               if(numbers[i]==j)
                   count[j]+=1;
           }

        }
        System.out.print("0~9出现的次数依次是");
        System.out.println(java.util.Arrays.toString(count));
    }
}
