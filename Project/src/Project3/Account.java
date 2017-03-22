package Project3;

import java.util.Scanner;

public class Account {
	
	private double balance;
	private final int num;
	public Account(double balance,int num) {
		this.balance = balance;
		this.num = num;
	}
	
	public void credit() {
		System.out.printf("Enter deposit amount for account%d: ",num);
		Scanner input = new Scanner(System.in);
		double money = input.nextDouble();
		this.balance += money;
	}
	
	public void debit() {
		System.out.printf("Enter withdrawal amount for account%d: ",num);
		Scanner input = new Scanner(System.in);
		double withdrawal = input.nextDouble();
		if(withdrawal > balance) {
			System.out.println("Debit amount exceeded account balance.");
		} else {
			System.out.printf("subtracting %.2f from account%d balance\n", withdrawal,num);
		
			this.setBalance(withdrawal,0);
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void print() {
		System.out.printf("account%d balnace: $%.2f\n",num,this.getBalance());
	}
	
	protected int getNum() {
		return num;
	}
	
	protected void setBalance(double withdrawal, double interest) {
		this.balance = balance + balance * interest -(withdrawal);
	}
}
