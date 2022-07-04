package 异常;

import java.util.Scanner;

public class 输入不了 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String[] arg=new String[3];
        for(int i=0;i<3;i++) {
            arg[i]=input.next();
        }

        try {
            if(arg.length!=3)
            {
                System.out.println("Usage:java Calculator operand1 operator operand2");
                System.exit(1);
            }
            int result = 0;
            switch(arg[1].charAt(0)) {
                case '+':result=Integer.parseInt(arg[0])+Integer.parseInt(arg[2]);break;
                case '-':result=Integer.parseInt(arg[0])-Integer.parseInt(arg[2]);break;
                case '.':result=Integer.parseInt(arg[0])*Integer.parseInt(arg[2]);break;
                case '/':result=Integer.parseInt(arg[0])/Integer.parseInt(arg[2]);break;
            }
            System.out.println(arg[0]+' '+arg[1]+' '+arg[2]+"="+result);
        }
        catch(NumberFormatException ex) {System.out.println("Wrong input :"+ex.getMessage());}
    }

}
