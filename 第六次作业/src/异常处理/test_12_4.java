package 异常处理;

import java.nio.FloatBuffer;
import java.util.Date;

public class test_12_4 {
    public static void main(String[] args) {
        try {
            Loan loan1=new Loan(0,2,3);
        } catch (IllegalArguementException e) {
            System.out.println("程序错误");
        }

    }
}
class Loan{
    private double annualInterestRate;
    private  int numberOfYears;
    private  double loanAmount;
    private java.util.Date loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArguementException {
       if(annualInterestRate>0&&loanAmount>0) {
           this.annualInterestRate = annualInterestRate;
           this.numberOfYears = numberOfYears;
           this.loanAmount = loanAmount;
       }
       else throw new IllegalArguementException(loanAmount,annualInterestRate);
        loanDate=new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
    public double getMonthlyPayment(){
        double monthlyInterestRate=annualInterestRate/1200;
        double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
    return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalPayment=getMonthlyPayment()*numberOfYears*12;
        return totalPayment;
    }
}
class IllegalArguementException extends Exception{
    private double loanAmount;
    private double annualInterestRate;
    public IllegalArguementException(double loanAmount,double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
        this.loanAmount=loanAmount;
    }

}