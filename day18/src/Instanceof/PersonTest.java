package Instanceof;

import java.util.Date;

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
        System.out.println("*************************");
        //不能调用子类特有的方法属性时，p2是Person类型
        p2.name="tony";
//        p2.earnMoney();
//       p2.isSmoking=true;
        //有了对性的多态性以后，内存中实际上加载了子类特有的方法和属性，但由于变量声明为父类类型，导致
        //只能调用父类的属性和方法

        //如何才能调用子类特有的属性和方法？
        //向下转型 使用强制类型转换符
        Man m1=(Man) p2;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        //使用强转时，可能出现ClassCastException的异常，为了避免这种错误我们使用instanceof
      // Woman w1=(Woman) p2;
       // w1.goShopping();
        /*
        instanceof的使用
        a instanceof A 判断a是否是类A的实例，如果是返回true，反之false
         */
        if(p2 instanceof Woman){
            Woman w1=(Woman) p2;
            w1.goShopping();
            System.out.println("*******woman********");
        }
        if(p2 instanceof Man){
            Man w1=(Man) p2;
            w1.earnMoney();
            System.out.println("*********man********");
        }
        //练习1：编译通过，运行不过
        //例1
       // Person p3=new Woman();
       // Man m3=(Man) p3;
        //例2
      //  Person p4=new Person();
      //  Man m4=(Man) p4;
        //问题二编译通过运行也通过
        Object obj=new Woman();
        Person p=(Person) obj;
        //问题三：编译不过
      //  Man m5=new Woman();
      //  String str=new Date();

    }


}
