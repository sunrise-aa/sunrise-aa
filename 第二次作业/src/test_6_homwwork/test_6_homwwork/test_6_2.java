package test_6_homwwork;

public class test_6_2 {
    public static int sumDigits(long n){
    int sum=0;
    while(n>9) {
        sum += n%10;
        n/=10;
    }
   sum+=n;
return sum;
    }
    public static void main(String[] args) {
      int x=sumDigits(23467);
    System.out.println(x);
    }
}
