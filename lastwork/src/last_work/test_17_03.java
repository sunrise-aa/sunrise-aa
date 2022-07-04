package last_work;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class test_17_03 {
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		try(FileInputStream file=new FileInputStream("Exercise_17_02.dat")){
		DataInputStream input=new DataInputStream(file);
		int sum=0;
		try {
		while(true) {
			sum+=input.readInt();
		}
		}catch(EOFException ex) {
			System.out.println("ºÍÎª"+sum);
		}
		}
	}

}
