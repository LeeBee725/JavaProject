package TermProject_1;

public interface Recordable {
	public void store(); // 항목의 내용을 안드로이드 내부 DB에 저장하는 함수
	public void revise(); // 항목의 내용을 수정하는 함수
	public void check(); // 항목의 완료/미완료 표시를 체크하는 함수
}
