package Project2;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(1);
		Account account2 = new Account(2);
		
		account1.credit(50);
		account2.credit(0);
		
		account1.balance();
		account2.balance();
		
		account1.debit();
		account1.balance();
		account2.balance();
		
		account2.debit();
		account1.balance();
		account2.balance();
	}

}
