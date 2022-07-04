package java重写;

public class StudentTest {
    public static void main(String[] args) {
        Student 向东亮=new Student("机器人工程");
        向东亮.name="向东亮";
        向东亮.age=20;
        System.out.println(向东亮.name);
        向东亮.eat();
        向东亮.walk(24);
        向东亮.study();
        向东亮.show();


    }
}
