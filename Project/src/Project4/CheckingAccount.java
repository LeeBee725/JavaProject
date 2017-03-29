package Project4;

public class CheckingAccount extends Account {
	private double creditLimit;
	private double interest;
	private double loanInterest;
	public CheckingAccount(double money, double cL, double inter, double lInter) {
		super(money);
		creditLimit = cL;
		interest = inter;
		loanInterest = lInter;
	}
	
	@Override
	public void debit(double amount) {
		if(isBankrupted()) {
			return ;
		} else {
			super.debit(amount);
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		if(super.getBalance() + creditLimit > 0) {
			return super.getBalance() + creditLimit;
		} else {
			return 0;
		}
	}
	@Override
	public void passTime(int month) {
		if(getBalance() > 0) {
			super.setBalance(getBalance()*(1+interest)*month);
		} else if(getBalance() < 0) {
			super.setBalance(getBalance()*(1+loanInterest)*month);
		}
	}
	
	public boolean isBankrupted() {
		if(this.getWithdrawableAccount() < 0) {
			return true;
		} else {
			return false;
		}
	}
}
