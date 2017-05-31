package TermProject_1;

import java.util.LinkedList;

public class RecordList {
	private LinkedList<Record> linkedlist = new LinkedList<Record>();
	
	RecordList() {}
	
	public void addRecord(Record record) {
		linkedlist.add(record);
	}
	
	public void showRecord() {
		int num = 0;
		System.out.println("번호 내용");
		for(Record record : linkedlist) {
			num++;
			System.out.printf("%2d %s\n",num,record.getText());
		}
	}
	
	public String getLinkedListElement(int num) {
		return linkedlist.get(num-1).getText();
	}
}