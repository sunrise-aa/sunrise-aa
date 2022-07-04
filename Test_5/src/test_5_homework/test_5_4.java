package test_5_homework;

public class test_5_4 {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("英里    千米");
        while (i < 11) {
            double x = 1.609 * i;
            System.out.println(i + "     " + x);
            i++;
        }
    }
}
