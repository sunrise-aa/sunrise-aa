package 面向对象;

public class test_2_1 {
    public static void main(String[] args) {
        String s1 = "Welcome to java";
        String s2 = "Programming is fun";
        String s3 = "Welcome to java";
       if(s1 == s2)
           System.out.println("true");
       else
           System.out.println("false");
    if(s1.equals(s3))
        System.out.println("true");
    else
        System.out.println("false");
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(5,11));
    }
}
