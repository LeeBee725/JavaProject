package TermProject_1;

public abstract class Record {
	private String contents;
	private boolean complete;
	
	Record() {
		complete = false;
	}
	Record(String value) {
		this();
		setContents(value);
	}
	
	public String getContents() {
		return contents;
	}
	
	public void setContents(String value) {
		contents = value;
	}
	
	public boolean isComplete() {
		return complete;
	}
	
	public void setComplete(boolean bool) {
		complete = bool;
	}
}
