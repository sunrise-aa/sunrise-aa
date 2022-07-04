package last_work;

import java.awt.RadialGradientPaint;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class test_17_2 {
	public static void main(String[] args) throws IOException {
		try(FileOutputStream output=new FileOutputStream("Exercise_17_02.dat",true)){
		
			for(int i=0;i<100;i++) {
				int radomNumber=(int)(Math.random()*100);
			
			output.write(radomNumber);
			}
		}
		try(FileInputStream input=new FileInputStream("Exercise_17_02.dat")){
			int num1;
			while((num1=input.read())!=-1)
			System.out.print(num1+" ");
		}

}
		
}