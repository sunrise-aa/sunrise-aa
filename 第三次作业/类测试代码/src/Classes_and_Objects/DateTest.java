package Classes_and_Objects;

public class DateTest {
    public static void main(String[] args) {
         java.util.Date date=new java.util.Date();
         for(int i=0;i<8;i++) {
             date.setTime(10000 * (long)Math.pow(10, i));
             System.out.println(date.toString());
         }
    }
}
