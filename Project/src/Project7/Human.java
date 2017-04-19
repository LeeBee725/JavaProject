package Project7;

public class Human implements Valuable {

	private String name;
	private int age;
	
	public Human(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Human name: %s\nregistered age:%d", name,age);
	}
	
	@Override
	public double estimateValue(int month) {
		return Double.POSITIVE_INFINITY;
	}
	public double estimateValue() {
		return Double.POSITIVE_INFINITY;
	}

}
