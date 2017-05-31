package TermProject_1;

import java.util.Scanner;

public abstract class Record implements Recordable {
	private String text;
	private boolean complete;
	
	Record() {
		complete = false;
	}
	Record(String value) {
		this();
		setText(value);
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String value) {
		text = value;
	}
	
	public boolean isComplete() {
		return complete;
	}
	
	public void setComplete(boolean bool) {
		complete = bool;
	}

	@Override
	public void store() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void check() {
		if(complete == true) {
			complete = false;
		} else { 
			complete = true;
		}
	}
	
	@Override
	public void revise() {

	}
}
