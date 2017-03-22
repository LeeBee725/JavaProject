package Project2;

import java.util.Scanner;

public class Account {
	
	public Account(int num) {
		this.num = num;
	}
	
	private double money;
	private final int num;
	
	public void credit(double money) {
		this.money = money;
	}
	
	public void debit() {
		System.out.printf("Enter withdrawal amount for account%d: ",num);
		Scanner input = new Scanner(System.in);
		double withdrawal = input.nextDouble();
		if(withdrawal > money) {
			System.out.println("Debit amount exceeded account balance.");
		} else {
			System.out.printf("subtracting %.2f from account%d balance\n", withdrawal,num);
		
			this.money -= withdrawal;
		}
	}
	
	public void balance() {
		System.out.printf("account%d balnace: $%.2f\n",num,money);
	}
}
