package Project6;

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
			throw new Exception("아직 출금할 수 없습니다.");
		} else if(amount < 0) {
			throw new Exception("음수입력!");
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
	
	@Override
	public String toString() {
		return String.format("SavingsAccount_Balance: %.2f", getBalance());
	}

	@Override
	public double EstimateValue(int month) {
		double value = getBalance();
		for(int i = 0; i < month; i ++) {
			value += value*interest;
		}
		return value;
	}

}
