package Class;

public class GrandP {

	public GrandP() {
		System.out.println("�ֻ��� �θ�����ڴ� ���� ���� ��.");
	}

}

class Parent extends GrandP {

	public Parent() {
		super();
		System.out.println("���� ȣ������� ���߿� �����");
	}

}

class Child extends Parent {

	public Child() {
		super();
		System.out.println("���� ���� ȣ������� ������ �θ� ����");
	}

}