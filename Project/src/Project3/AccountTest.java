package Project3;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount account1 = new CheckingAccount(100,1,1000,0.01,0.07);
		CheckingAccount account2 = new CheckingAccount(100,2,1000,0.01,0.07);
		
		account1.print();
		account2.print();
		account1.credit();
		
		account1.print();
		account2.print();
		account2.debit();
		
		account1.print();
		account2.print();
		
		System.out.println("next month!");
		account1.nextMonth();
		account2.nextMonth();
		account1.print();
		account2.print();
	}

}
