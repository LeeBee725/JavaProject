package TermProject_1;

import java.util.LinkedList;

public class RecordList {
	private LinkedList<Record> linkedlist = new LinkedList<Record>();
	
	RecordList() {}
	
	public void addRecord(Record record) {
		linkedlist.add(record);
	}
	
	public void showRecord() {
		for(Record record : linkedlist) {
			System.out.println(record.getContents());
		}
	}
}