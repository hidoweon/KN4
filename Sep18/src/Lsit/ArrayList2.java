package Lsit;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String ��ü�� ��� lsit �����
		// "ȫ�浿, ������, �Ӳ���"�� ���� �� ����� ������ �����ϵ��� �ۼ�
		// "�̼���"�� ����ִ��� Ȯ��
		// ��� ��ü�� ���
		// index��ȣ 2���� �ش��ϴ� ��ü�� "������"���� �����ϼ���.
		// index��ȣ 3���� �ش��ϴ� ��ü�� ����ϼ���
		// ����Ʈ���� ��� ��ü�� ������
		// ����Ʈ�� ����ִ��� Ȯ�� �޼����� ���

		List<String> list = new ArrayList<>();

		list.add("ȫ�浿");
		list.add("������");
		list.add("�Ӳ���");

		int n = list.size();
		System.out.println(n);

		System.out.println(list.contains("�̼���") ? "�̼����� ����Ʈ�� �����մϴ�." : "�̼����� ����Ʈ�� �������� �ʽ��ϴ�.");

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i));
		System.out.println();

		list.set(2, "������");

		System.out.println(list.get(2));
		System.out.println();
		System.out.println(list);
		System.out.println();

		list.clear();

		System.out.println(list.isEmpty() ? "�������" : "������� ����");

	}

}
