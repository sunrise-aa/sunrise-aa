package fengzhuang;

public class Person {
    private int age;
    public void setAge(int a){
        if(a<0||a>130)
            System.out.println("投入错误");
        else
            age=a;
    }
    public int getAge(){
        return age;
    }


}

