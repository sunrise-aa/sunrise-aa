package 面向对象;

public class test_2_6 {
}
class Test1245 {
    public static void main(String[] args) {
        try{
            int[] array = new int[100];
            System.out.println("array[100] is " + array[100]);
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException");
        }catch(RuntimeException ex){
            System.out.println("RuntimeException");
        }catch(Exception ex){
            System.out.println("Exception");
        }
    }
}