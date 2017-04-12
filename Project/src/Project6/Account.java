package Project6;

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
	
	public void setBalance(double amount) {
		this.balance = amount;
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int month);
}
