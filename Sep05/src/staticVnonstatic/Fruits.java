package staticVnonstatic;

public class Fruits {

	static int currentAmount = 100;
	int amount;

	Fruits(int amount) {
		this.amount = amount;
		currentAmount -= amount;

	}

}
