package 异常处理;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class test_12_19 {
    public static void main(String[] args) {
       int count=0;
        try {
            URL ur1=new URL("http://liveexample.pearsoncmg.com/data/Lincoln.txt");

            Scanner input=new Scanner(ur1.openStream());
            while(input.hasNext()){
                input.next();
                count++;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("这篇演讲有"+count+"个单词");
    }
}
