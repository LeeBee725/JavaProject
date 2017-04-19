package Project7;

public class SavingsAccount extends Account {
	private double interest;
	private int month;
	
	public SavingsAccount(double money, double inter) {
		super(money);
		this.interest = inter;
	}
	
	@Override
	public void debit(double amount) throws Exception{
		if(month < 12) {
			throw new Exception("���� ����� �� �����ϴ�.");
		} else if(amount < 0) {
			throw new Exception("�����Է�!");
		} else {
			super.debit(amount);
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		if(month < 12) {
			return 0;
		} else {
			return getBalance();
		}
	}
	@Override
	public void passTime(int month) {
		if(this.month >= 12) {
			super.setBalance(getBalance() * Math.pow((1+interest), month));
		}
		this.month += month;
	}
	public void passTime() {
		if(this.month >= 12) {
			super.setBalance(getBalance() * Math.pow((1+interest), 1));
		}
		this.month += month;
	}
	
	@Override
	public String toString() {
		return String.format("SavingsAccount_Balance: %.2f", getBalance());
	}

	@Override
	public double estimateValue(int month) {
		double value = getBalance();
		for(int i = 0; i < month; i ++) {
			value += value*interest;
		}
		return value;
	}
	public double estimateValue() {
		double value = getBalance();
		value += value*interest;
		return value;
	}
}
