package abstract练习;

public class EmployeeTst {
    public static void main(String[] args) {
        Employee manager=new Manager("库克",1001,5000,50000);
        manager.work();
        CommonEmployee commonEmployee=new CommonEmployee();
        commonEmployee.work();
    }
}
