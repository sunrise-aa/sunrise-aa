package last_work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class test_17_1 {
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("Excercise17_01.txt");
		if(file.exists()) {
			System.out.println("���ļ��Ѵ���");
			PrintWriter output=new PrintWriter(file);
			for(int i=0;i<100;i++) {
			
			output.print((int)(Math.random()*100));
			output.print(" ");
			}
			output.close();
		}
		else {
			PrintWriter output=new PrintWriter(file);
			for(int i=0;i<100;i++) {
		      output.print((int)(Math.random()*100));
		      output.print(" ");
			 }
		     output.close();
			}

}
}