package Classes_and_Objects;

public class AccountTest {
    public static void main(String[] args) {
        Account account1=new Account(1122,20000.0);
        account1.setAnnualInterestRate(0.45);
        account1.withDraw(2500);
        account1.deposit(3000);
        account1.toString1();
    }
}
