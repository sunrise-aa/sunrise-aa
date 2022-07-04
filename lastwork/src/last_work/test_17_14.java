package last_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class test_17_14 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		String file1=sc.next();
		String file2=sc.next();
		int[] byte1={2,4,6,8,10};
		int[] byte3=new int[byte1.length];
 		try(ObjectOutputStream output1=new ObjectOutputStream(new FileOutputStream(file1,true))){
			output1.writeObject(byte1);
		}
		try(ObjectInputStream input1=new ObjectInputStream(new FileInputStream(file1))){
			int[] byte2=(int[])(input1.readObject());
			for(int i=0;i<byte2.length;i++)
				byte3[i]=byte2[i];
		}
		try(ObjectOutputStream output1=new ObjectOutputStream(new FileOutputStream(file2,true))){
			int[] byte4=new int[byte3.length];
			for(int i=0;i<byte3.length;i++)
				byte4[i]=byte3[i]+5;

			output1.writeObject(byte4);
		}
	}

}
