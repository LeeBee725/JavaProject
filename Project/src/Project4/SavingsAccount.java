package Project4;

public class SavingsAccount extends Account {
	private double interest;
	private int month;
	
	public SavingsAccount(double money, double inter) {
		super(money);
		this.interest = inter;
	}
	
	@Override
	public void debit(double amount) {
		if(month < 12) {
			System.out.println("아직 출금할 수 없습니다.");
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
}
