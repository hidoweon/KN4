package Method2;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle pizza = new Circle(10);

		increase(pizza);
		System.out.println(pizza.radius);

	}

	static void increase(Circle m) {
		m.radius++;
	}
}

class Circle {
	int radius;

	Circle(int r) {
		radius = r;
	}

}
