package 异常处理;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test_12_21 {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("SortedStrings.txt");
        Scanner input=new Scanner(file);
        ArrayList<Integer> list=new ArrayList<>();
        while(input.hasNext()){
            list.add(input.nextInt());
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            System.out.print(" "+list.get(i));
        }
    }
}
