package TermProject_1;

import java.util.Scanner;

public class BucketTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RecordList completeRecord = new RecordList();
		RecordList nonCompleteRecord = new RecordList();
		int choice;
		do {
			System.out.println("1.����Ʈ�� �׸� �߰� 2.����Ʈ�� �׸� ��� 3.����");
			choice = input.nextInt();
			input.nextLine(); // �Է¹��� ����
			switch(choice) {
			case 1: System.out.print("�Է�: "); nonCompleteRecord.addRecord(new NormalRecord(input.nextLine())); break;
			case 2: nonCompleteRecord.showRecord(); break;
			case 3: break;
			default: System.out.println("���� �ٽ��Է�!"); break;
			}
		} while(choice != 3);
		input.close();
		//System.out.print(nonCompleteRecord.getLinkedListElement(1));
	}
}