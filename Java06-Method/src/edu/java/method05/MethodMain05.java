package edu.java.method05;

// �޼ҵ� overloading
// 1. �Ű������� ������ �ٸ��ų�
// 2. �Ű������� Ÿ���� �ٸ� ���
// ���� �̸����� �޼ҵ带 ������ �� ����
// (����) �޼ҵ��� ����Ÿ�Ը� �ٸ� ���� ���� �̸����� �޼ҵ带 ������ �� ����
public class MethodMain05 {

	public static void main(String[] args) {
		sayHello();
		sayHello("���");
		sayHello(24, "���");
		sayHello("���", 23);
		
		System.out.println();
		System.out.println("���ڿ�");
		System.out.println(1);
		System.out.println(1.0);
		System.out.println(true);

	} // end main()
	
	public static void sayHello() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public static void sayHello(String name) {
		System.out.println("�ȳ�?");
		System.out.println("�� �̸��� : " + name + " �Դϴ�.");
	}
	
	public static void sayHello(String name, int age) {
		System.out.println("�̸� : " + name);
		System.out.println("���� :" + age);
	}
	
	public static void sayHello(int age, String name) {
		System.out.println("�� ���̴� : " + age);
		System.out.println("�� �̸��� :" + name);
	}

} // end MethodMain05
