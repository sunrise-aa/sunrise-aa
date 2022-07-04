package 继承与多态;

import java.util.ArrayList;
import java.util.Date;

public class test_11_6 {
    public static void main(String[] args) {
        ArrayList<java.lang.Object> list=new ArrayList<>();
        Loan loan=new Loan(2);
        list.add(loan);
        java.util.Date date=new Date();
        list.add(date);
        list.add("Shaby");
        Circle circle=new Circle(6);
        list.add(circle);
        System.out.println( " "+list.toString());
    }
}
class Loan{
    private double money;
    public Loan( double money) {
        this.money = money;
    }
public String toString(){
        return "the loan money is "+money;
}

}
class  Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public String toString(){
        return "the circle's radius is "+radius;
    }
}