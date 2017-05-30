package TermProject_1;

public class ListBuilder {
	public RecordList CreateCompleteList() { //완료항목 생성
		RecordList completeList = new RecordList();
		completeList.addRecord(new NormalRecord());
		return completeList;
	}
	
	public RecordList CreateNonCompleteList() { //미완료항목 생성
		RecordList nonCompleteList = new RecordList();
		nonCompleteList.addRecord(new NormalRecord("hi"));
		return nonCompleteList;
	}
}
