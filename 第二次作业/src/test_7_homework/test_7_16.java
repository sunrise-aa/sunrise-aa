package test_7_homework;

public class test_7_16 {
    public static int linearSearch(int[] list,int key) {
        for (int i = 0; i < list.length; i++) {
         if (key == list[1])
                return i;
    }
        return -1;
    }
    public static  int binarySearch(int[] list,int key){

        int low=0;
        int high=list.length-1;
        while(high>=low){

            int mid=(low+high)/2;
            if(key<list[mid])
                high=mid-1;
            else if(key==list[mid])
                return mid;
            else
                low=mid+1;
        }
        return -low-1;
    }
    public static void main(String[] args) {
        int[] numbers=new int[100000];

        int i=0;
        for(i=0;i<100000;i++){

            numbers[i]=(int)(Math.random()*1000000);
        }
        long begintime=System.nanoTime();
        int j=linearSearch(numbers,50000);
        long endtime=System.nanoTime();
        long firsttime=endtime-begintime;
        System.out.println("The first time is "+firsttime);
        java.util.Arrays.sort(numbers);
        long startime=System.nanoTime();
        int k=binarySearch(numbers,50000);
        long overtime=System.nanoTime();
        long secondtime=overtime-startime;
        System.out.println("The sencond time is "+secondtime);
    }
}
