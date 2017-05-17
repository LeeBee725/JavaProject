package Project8;

import java.util.ArrayList;

public abstract class Account implements Valuable {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void debit(double amount) throws Exception {
		if(amount <= balance) {
			this.balance -= amount;
		}
	}
	
	public void credit(int amount) {
		setBalance(getBalance() + amount);
	}
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public static double sumForAccount(ArrayList<Account> list){
		double sum = 0;
		for(Account account:list) {
			sum += account.getBalance();
		}
		return sum;
	}
	
	public static void passTimeForList(ArrayList<Account> list, int month) {
		for(Account account:list) {
			account.passTime(month);
		}
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int month);
	public abstract void passTime();
}
