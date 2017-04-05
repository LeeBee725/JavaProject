package Project5;

public class ValuableTest {

	public static void main(String[] args) {
		Account account1 = new CheckingAccount(100,50,0.01,0.07);
		Account account2 = new SavingsAccount(100,0.05);
		Car car = new Car("MyCar",5000);
		Human human = new Human("Mark",20);
		
		Valuable[] objectList = new Valuable[4];
		
		objectList[0] = account1;
		objectList[1] = account2;
		objectList[2] = car;
		objectList[3] = human;
		
		for(Valuable objectItem:objectList) {
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("6 month later Valuable: %.2f\n\n", objectItem.EstimateValue(6));
		}
	}

}
