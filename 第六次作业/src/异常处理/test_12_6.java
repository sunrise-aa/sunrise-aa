package 异常处理;

import java.util.Scanner;

public class test_12_6 {
    public static void main(String[] args) {
        System.out.println("输入一个16进制的数字");
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
        System.out.println("该数转换为10进制为"+hexToDecimal(num1));

    }
    public static int hexToDecimal(String hex){
        int decimalValue=0;
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            decimalValue=decimalValue*16+hexToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexToDecimal(char ch)throws NumberFormatException{
        if(ch>='A'&&ch<='F')
            return 10+ch-'A';
        else if(ch>='0'&&ch<='9')
            return ch-'0';

        else
          throw new NumberFormatException();
    }

}
