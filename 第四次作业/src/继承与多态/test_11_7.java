package 继承与多态;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class test_11_7 {

    public static void main(String[] args) {
       Integer [] array={1,2,3,4,5,6,7,8,9};
       ArrayList<Integer> list=new ArrayList<>(Arrays.asList(array));
       shuffle(list);
       for(Integer number:list)
           System.out.print(number+" ");

    }
    public static void shuffle(ArrayList<Integer> list){
      if(list.size()>10)
      {int size=(int)(Math.random()*10*(list.size()-list.size()%10)/10+10);
        int randomNumbers1;
        int raadomNumbers2;

        for(int i=0;i<size;i++) {
            randomNumbers1 = (int) (Math.random() * 10 * ((list.size() - list.size() % 10) / 10));
            raadomNumbers2 = (int) (Math.random() * 10 *( (list.size() - list.size() % 10)) / 10);
            int temp1= list.get(randomNumbers1);
            int temp2=list.get(raadomNumbers2);
            list.set(randomNumbers1,temp2);
            list.set(raadomNumbers2,temp1);
        }
    }
      else {
          int randomNumbers1;
          int raadomNumbers2;
          int size=(int)(Math.random()*100000);
          for(int i=0;i<size;i++) {
            randomNumbers1 = (int) (Math.random() *list.size());
            raadomNumbers2 = (int) (Math.random() *list.size());
            int temp1= list.get(randomNumbers1);
            int temp2=list.get(raadomNumbers2);
            list.set(randomNumbers1,temp2);
            list.set(raadomNumbers2,temp1);
          }
          }
    }
}
