package TermProject_1;

public class BucketTest {
	public static void main(String[] args) {
		ListBuilder listBuilder = new ListBuilder();
		
		RecordList nonCompleteRecord = listBuilder.CreateNonCompleteList();
		nonCompleteRecord.showRecord();
	}
}