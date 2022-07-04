package last_work;

import java.beans.Transient;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class test_17_6 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Loan[] loan=new Loan[5];
		for(int i=0;i<5;i++) {
			 loan[i]=new Loan();
		}
		try(ObjectOutputStream output=new ObjectOutputStream(new FileOutputStream("Exercise_17_06.dat",true))){
			output.writeObject(loan);
		}
	
	}

}
class Loan implements Serializable{
	private static final long serialVersionUID = -7222640828592495418L ;
			
	private double annualInterestRate=0.12;
	private int numberOfyears;
	private double loanAmount=100;
	private java.util.Date loanDate;
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfyears() {
		return numberOfyears;
	}
	public void setNumberOfyears(int numberOfyears) {
		this.numberOfyears = numberOfyears;
	}
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	public void setLoanDate(java.util.Date loanDate) {
		this.loanDate = loanDate;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Loan(double annualInterestRate, int numberOfyears, double loanAmount) {
		super();
		this.annualInterestRate = annualInterestRate;
		this.numberOfyears = numberOfyears;
		this.loanAmount = loanAmount;
		
	}
	public Loan() {

	}
	public double getMonthpayment() {
		double monthlyInterestRate=annualInterestRate/1200;
		double monthlyPayment=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfyears*12)));
		return monthlyPayment;
	}
	public double payTotalment() {
		return getMonthpayment()*numberOfyears*12;
	}
	public String toString() {
		return "Loan [annualInterestRate=" + annualInterestRate + ", numberOfyears=" + numberOfyears + ", loanAmount="
				+ loanAmount + ", loanDate=" + loanDate + "]";
	}
	
}