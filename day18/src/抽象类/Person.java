package 抽象类;

public abstract class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();


    public void walk() {
        System.out.println("人走路");
    }

}
class Student extends Person{
    public Student(String name,int age){
        super(name,age);
    }
    public void eat(){
        System.out.println("学生吃些营养的");
    }
}

