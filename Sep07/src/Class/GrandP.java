package Class;

public class GrandP {

	public GrandP() {
		System.out.println("최상위 부모생성자는 먼저 실행 됨.");
	}

}

class Parent extends GrandP {

	public Parent() {
		super();
		System.out.println("먼저 호출되지만 나중에 실행됨");
	}

}

class Child extends Parent {

	public Child() {
		super();
		System.out.println("가장 먼저 호출되지만 실행은 부모 다음");
	}

}