package edu.java.inherit05;

import java.util.Objects;

public class InheritMain05 {

	public static void main(String[] args) {
		String str = new String("���ڿ�");
		System.out.println(str);
		
		System.out.println();
		Person p1 = new Person("��Ʈ");
		System.out.println(p1);
		
		// Point Ŭ���� ����
		// ��� ����(double x, double y)
		// �Ű����� ������ Point(double x, double y)
		// toString �������̵��ؼ� (x, y) ������ ���ڿ��� �����ϴ�
		// �޼ҵ带 �ϼ��ϼ���.
		// ����) (1, 2) or (3, 4)
		System.out.println(new Point(1, 1));
	} // end main()

} // end InheritMain05

