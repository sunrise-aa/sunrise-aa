package last_work;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class test_17_7 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		double sum=0;
		int i=0;
		try(ObjectInputStream input=new ObjectInputStream(new FileInputStream("Exercise_17_06.dat"))){
			try {
			while(true) {
				Loan[] loan2=(Loan[])(input.readObject());
				sum+=loan2[i].payTotalment();
				i++;
			}
			}catch(EOFException e) {
				System.out.println("ºÍÎª"+sum);
				
			}
			
		}
	}

}
