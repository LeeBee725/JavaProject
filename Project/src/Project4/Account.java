package Project4;

public abstract class Account {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void debit(double amount) {
		this.balance -= amount;
	}
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int month);
}
