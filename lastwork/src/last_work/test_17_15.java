package last_work;

import java.io.*;
import java.util.Scanner;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class test_17_15 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Scanner sc = new Scanner(System.in);
        String file1 = sc.next();
        String file2 = sc.next();
      int[] byte1=new int[5];

        try (ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream(file1, true))) {

        }
        try (ObjectInputStream input1 = new ObjectInputStream(new FileInputStream(file1))) {
            int[] byte2=(int[])(input1.readObject());
            for(int i=0;i<5;i++)
                byte1[i]+=byte2[i]-5;
        }
        try (ObjectOutputStream output1 = new ObjectOutputStream(new FileOutputStream(file2, true))) {

            output1.writeObject(byte1);
        }

    }
}
