package test_7_homework;

import javax.imageio.stream.ImageInputStream;

public class test_7_10 {
    public static int indexOfSmallestElement(double[] arry){
        int i=0,a=0;
        double min=arry[0];
        for(i=1;i< arry.length;i++){
            if(arry[i]<min)
            {
                min=arry[i];
                a=i;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        double[] arry={5,7,3,1,9};
        int a=indexOfSmallestElement(arry);
        System.out.println("最小元素的下标是"+a);
    }
}
