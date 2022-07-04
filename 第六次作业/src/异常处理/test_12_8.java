package 异常处理;

import java.util.Scanner;

public class test_12_8 {
    public static void main(String[] args) {
        System.out.println("输入一个16进制的数字");
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
        try {
            System.out.println("该数转换为10进制为"+hexToDecimal(num1));
        } catch (HexFormationException e) {
            e.printStackTrace();
        }

    }
    public static int hexToDecimal(String hex) throws HexFormationException {
        int decimalValue=0;
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            decimalValue=decimalValue*16+hexToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexToDecimal(char ch)throws HexFormationException{
        if(ch>='A'&&ch<='F')
            return 10+ch-'A';
        else if(ch>='0'&&ch<='9')
            return ch-'0';

        else
            throw new HexFormationException(ch);
    }

}
class HexFormationException extends Exception{
    char ch;
    public HexFormationException(char ch){
        this.ch=ch;
        System.out.println("输入类型不为16进制");
    }
}