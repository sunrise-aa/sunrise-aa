package last_work;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Exercise_17_04 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(FileOutputStream output=new FileOutputStream("Exercise_17_04.bin",true)){
		File file=new File("Exercise_17_01.txt");
		Scanner input=new Scanner(file);
			DataOutputStream output1=new DataOutputStream(output);
		
				while(input.hasNextLine()) {
					output1.writeUTF(input.nextLine());
				}
				
				
					File file1=new File("Exercise_17_01.txt");
					File file2=new File("Exercise_17_04.bin");
					
					System.out.println("文本文件的大小为"+file1.length());
					System.out.println("二进制文件的大小为"+file2.length());
					
					
				}
			
			
			}
		}
	
		
	


