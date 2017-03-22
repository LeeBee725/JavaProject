package Project1;

import java.util.Scanner;

public class addnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		num1 = input.nextInt();
		System.out.print("Enter 2nd number: ");
		num2 = input.nextInt();
		
		result = num1 + num2;
		
		System.out.printf("%d + %d = %d\n",num1,num2,result);
		
	}

}
