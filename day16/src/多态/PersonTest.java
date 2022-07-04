package 多态;

public class PersonTest {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.eat();
        p1.walk();
        Man man=new Man();
        man.eat();
        man.walk();
        man.earnMoney();
        Person p2=new Man();
        p2.eat();
        p2.walk();

    }
}
