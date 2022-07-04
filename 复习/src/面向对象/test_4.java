package 面向对象;

public class test_4 {
}
class Person {
    private int age;
    public Person(){
        this(0);
        System.out.println("Person's no args constructor invoked");

    }
    public Person(int age){
       this.age = age;
    }
    public void setAge(int age){
        this.age = age;
    }
}