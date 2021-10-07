package Class;

public class ClassEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.set(2, 3);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("Blue");
		cp.showColorPoint();
	}

}

class Point {
	private int x, y;

	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	public void setColor(String color) {
		this.color = color;
	}

	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
