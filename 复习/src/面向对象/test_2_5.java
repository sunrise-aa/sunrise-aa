package 面向对象;

public class test_2_5 {
}

class Test1{
    public static void main(String[] args) {
       Animal dog= new Dog();
    }
}class Animal{
    int age = 4;
    public Animal(){
        setAge(20);
        System.out.println(" animal’s age is " + age);
    }
    public void setAge(int age){
        this.age = age * 2;
    }
}
class Dog extends Animal{
    public Dog(){
        setAge(30);
        System.out.println("dog’s is " + age);
    }@Override public void setAge(int age){
        this.age = age * 3;
    }
}