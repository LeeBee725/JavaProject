package Project3;

import java.util.Scanner;

public class CheckingAccount extends Account {

	private double credit_limit;
	private double interest;
	private double loan_interest;
	public CheckingAccount(double balance, int num, double limit, double interest, double l_interest) {
		super(balance, num);
		this.credit_limit = limit;
		this.interest = interest;
		this.loan_interest = l_interest;
	}
	
	@Override
	public void debit() {
		System.out.printf("Enter withdrawal amount for account%d: ",super.getNum());
		Scanner input = new Scanner(System.in);
		double withdrawal = input.nextDouble();
		if(withdrawal > credit_limit) {
			System.out.println("Debit amount exceeded credit_limit.");
		} else {
			super.setBalance(withdrawal,0);
		}
	}
	
	public void nextMonth() {
		if(super.getBalance() > 0) {
			super.setBalance(0,interest);
		} else if(super.getBalance() < 0) {
			super.setBalance(0,loan_interest);
		}
	}
	
}
