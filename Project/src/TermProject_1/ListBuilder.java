package TermProject_1;

public class ListBuilder {
	public RecordList CreateCompleteList() { //�Ϸ��׸� ����
		RecordList completeList = new RecordList();
		completeList.addRecord(new NormalRecord());
		return completeList;
	}
	
	public RecordList CreateNonCompleteList() { //�̿Ϸ��׸� ����
		RecordList nonCompleteList = new RecordList();
		nonCompleteList.addRecord(new NormalRecord("hi"));
		return nonCompleteList;
	}
}
