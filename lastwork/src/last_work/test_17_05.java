package last_work;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class test_17_05 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		int[] array= {1,2,3,4,5};
		Date date1=new Date();
		double num1=5.5;
		try(ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("Exercise_17_05.dat",true))){
			output.writeObject(array);
			output.writeObject(date1);
			output.writeObject(num1);
			
		}
		  try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("Exercise_17_05.dat"))){
			  int[] newNumbers=(int[])(input.readObject());
			  Date date2=(Date)(input.readObject());
			  double num2=(double)(input.readObject());
			 System.out.println(Arrays.toString(newNumbers));
			 System.out.println(date2);
			 System.out.println(num2);
		  }
		  
	}

}
