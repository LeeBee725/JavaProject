package TermProject_1;

import java.util.Scanner;

public class BucketTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		RecordList completeRecord = new RecordList();
		RecordList nonCompleteRecord = new RecordList();
		int choice;
		do {
			System.out.println("1.리스트에 항목 추가 2.리스트의 항목 출력 3.종료");
			choice = input.nextInt();
			input.nextLine(); // 입력버퍼 비우기
			switch(choice) {
			case 1: System.out.print("입력: "); nonCompleteRecord.addRecord(new NormalRecord(input.nextLine())); break;
			case 2: nonCompleteRecord.showRecord(); break;
			case 3: break;
			default: System.out.println("오류 다시입력!"); break;
			}
		} while(choice != 3);
		input.close();
		//System.out.print(nonCompleteRecord.getLinkedListElement(1));
	}
}