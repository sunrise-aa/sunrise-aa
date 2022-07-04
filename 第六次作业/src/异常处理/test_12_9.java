package 异常处理;

import java.util.Scanner;

public class test_12_9 {
    public static void main(String[] args) {
        System.out.println("输入一个2进制的数字");
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
        try {
            System.out.println("该数转换为10进制为"+hexToDecimal(num1));
        } catch (BinaryFormationExcption e) {
            e.printStackTrace();
        }

    }
    public static int hexToDecimal(String hex) throws BinaryFormationExcption {
        int decimalValue=0;
        for(int i=0;i<hex.length();i++){
            char hexChar=hex.charAt(i);
            decimalValue=decimalValue*2+hexToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexToDecimal(char ch)throws BinaryFormationExcption{
        if(ch=='1'||ch=='0')
            return ch-'0';

        else
            throw new BinaryFormationExcption(ch);
    }

}
class BinaryFormationExcption extends Exception{
    char ch;
    public BinaryFormationExcption(char ch){
        this.ch=ch;
        System.out.println("输入类型不为2进制");
    }
}

