package staticVnonstatic;

public class CarMain {
	// non-static������ ��ü�� ���� �� ���ٰ���
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.gas = 10;
		myCar.setSpeed(100);

		Car yourCar = new Car();
		yourCar.gas = 20;
		yourCar.setSpeed(80);
	}
}

class Car {
	int gas;

	void setSpeed(int speed) {

	}
}