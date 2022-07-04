package test_6_homwwork;

public class test_6_12 {
    public static void printChars(char ch1,char ch2,int x){
        char i=ch1;
        int j=0;
        while(j<=ch2-ch1)
        {
            if(j%x==0)
            System.out.print("\n");
            System.out.printf("%c ",i);
            i++;
            j++;
        }
    }
    public static void main(String[] args) {
        printChars('1','z',10);
    }
}
