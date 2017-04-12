package Project6;

public class CheckingAccount extends Account{
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
	public void debit(double amount) throws Exception {
		if(isBankrupted()) {
			return ;
		} else if(creditLimit < amount) {
			throw new Exception("Debit amount exceeded account balance.");
		} else if(amount < 0) {
			throw new Exception("�����Է�!");
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
	
	@Override
	public String toString() {
		return String.format("CheckingAccount_Balance: %.2f", getBalance());
	}

	@Override
	public double EstimateValue(int month) {
		passTime(6);
		return getBalance();
	}
}
