package Project5;

public class Car implements Valuable {

	private String name;
	private double price;
	
	public Car(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("car name: %s\ninitial price:%.2f", name,price);
	}
	
	@Override
	public double EstimateValue(int month) {
		double value;
		value = price *(1-0.2);
		for (int i = 0; i<month; i ++) {
			value = value*(1-0.01);
		}
		return value;
	}

}
