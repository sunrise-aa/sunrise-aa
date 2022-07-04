package 面向对象;

public class test_2_4 {

}
class E{
    int e1 = 1;
    int e2 = 2;
}
class Test {
    public static void main(String[] args) {
        E e = new E();
        int temp = e.e1;
        e.e1 = e.e2;
        e.e2 = temp;
        System.out.println("e1 = " + e.e1 + " e2 = " + e.e2);
    }

}