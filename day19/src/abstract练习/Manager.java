package abstract练习;

public class Manager extends Employee{
    private double bonus;
    public  void work(){
        System.out.println("管理员员工提高公司运行效率");
    }
    public Manager(String name,int id,double salary,double bonus){
        super(name,id,salary);
        this.bonus=bonus;
    }
}
