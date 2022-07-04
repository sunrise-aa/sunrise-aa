package 面向对象;

public class test_2 {
    public static void main(String[] args) {


        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (i * j > 2)
                    break;
                System.out.println(i * j);
            }
            System.out.println(i);
        }
    }
    public static void print(double numbers, String name){}
}