package 异常处理;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test_12_15 {
    public static void main(String[] args) throws Exception {
        File file =new File("Exersise12_15.txt");
        if(file.exists()){
            System.out.println("File is already");
            System.exit(1);
        }
        PrintWriter out=new PrintWriter(file);
        for(int i=0;i<100;i++){
            out.print((int)(Math.random()*100));
            out.print(" ");
        }
            out.close();
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
