package java重写;

public class Person {
    String name;
    int age;
    public Person(){
    }
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    public void eat(){
        System.out.println("吃饭");
    }
    private void walk(int distance){
        System.out.println("行走的距离是"+distance);
    }

}
