package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// �⺻�����ڸ� ����Ͽ�, MyCircle Ŭ������ �ν��Ͻ� ����
		MyCircle circle1 = new MyCircle();
		System.out.println("������ : " + circle1.radius);
		System.out.println("���� : " + circle1.calcArea());
		
		// circle1 ��ü�� ������ 1.0 ���� �����Ͽ� ������ ,���� ���
		circle1.radius = 4;		
		System.out.println("������ : " + circle1.radius);
		System.out.println("���� : " + circle1.calcArea());
		
		System.out.println("=============");
		
		// 2. �Ű������� �ִ� �����ھ� 10.0�� ������ �ְ�
		// MyCircle Ŭ���� �ν��Ͻ��� ������ ����, ������, ���� ����ϱ�
		MyCircle circle2 = new MyCircle(10.0);		
		System.out.println("������ : " + circle2.radius);
		System.out.println("���� : " + circle2.calcArea());
		
		
		
	} // end main()

} // end ClassMain03
