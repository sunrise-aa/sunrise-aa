package Classes_and_Objects;


import java.util.Date;

public class Account {
    private int id;
    /**
     *
     */
    private double balance;
    /**
     *
     */
    private double annualInteresrRate;
    /**
     *
     */
    private Date dateCreated=new Date();
    /**
     *
     */
    public Account() {
    }
    /**
     *
     */
    Account(int id, double balance) {
    this.setBalance(balance);
    this.setId(id);
    }
    /**
     * @return
     */
    public int getId() {

        return id;
    }
    /**
     * @param
     */
    public void setId(int id) {
        this.id = id;

    }
    /**
     * @return
     */
    public double getBalance() {

        return balance;
    }
    /**
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = (balance > 0 ? balance : 0);

    }
    /**
     * @return
     */
    public double getAnnualInterestRate() {

        return annualInteresrRate;
    }
    /**
     * @param n
     */
    public void setAnnualInterestRate(double n) {
        this.annualInteresrRate = (n > 0 ? n : 0);

    }
    /**
     * @return
     */
    public Date getDateCreated() {
        return dateCreated;
    }
    /**
     * @return
     */
    public double getMonthlyInterestRate() {

        return annualInteresrRate / 12;
    }
    /**
     * @return
     */
    public double getMonthlyInterest() {

        return annualInteresrRate / 12 * balance;
    }
    /**
     *
     */
    public void withDraw(double a) {
        if (a >= 0 && a <= balance)
            balance-= a;
        else
            System.out.println("输入错误");
    }
    /**
     *
     */
    public void deposit(double b) {
        if (b >= 0)
            balance += b;
        else
            System.out.println("输入错误");
        // TODO implement here
    }
    public void toString1() {
        System.out.println("The balance ，monthlyInterest and dateCreated is " + balance + " , " + annualInteresrRate / 12 * balance + " and " + this.getDateCreated());

    }

}