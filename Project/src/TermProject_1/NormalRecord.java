package TermProject_1;

import java.util.Scanner;

public class NormalRecord extends Record implements Recordable {
	
	NormalRecord() {
		super();
	}
	NormalRecord(String value) {
		super(value);
	}

	@Override
	public void input() {
		Scanner input = new Scanner(System.in);
		setContents(input.nextLine());
		input.close();
	}

	@Override
	public void store() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void check() {
		// TODO Auto-generated method stub
		
	}
	
}
