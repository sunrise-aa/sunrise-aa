package java重写;

public class Student extends Person {
    String major;
    public  Student(){
    }
    public Student(String major){
        this.major=major;
    }
    public void study(){
        System.out.println("学习专业是"+major);
        show();
    }
     public void eat(String food){
        System.out.println("我儿应该吃些有营养的食物");
    }
     void walk(int distance){
        System.out.println("我儿是个懒🐍，他抹灰会跑步");
    }
    public void show(){
        System.out.println("我"+age+"岁了"+"是"+major+"专业");
    }
}
