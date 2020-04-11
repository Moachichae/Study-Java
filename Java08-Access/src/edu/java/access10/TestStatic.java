package edu.java.access10;


//Java Runtime(����ȯ��, Virtual Machine)�� �����ϴ� �޸� :
//1. Stack(����) : ���� ����, �Ű������� �����ϴ� �޸� ����
//2. Heap(��) : �ν��Ͻ�( ���� �ڷ��� : �迭, Ŭ���� ��)�� ����Ǵ� �޸� ����
//3. Method(�޼ҵ�) : static���� ������ ����, �޼ҵ��� ���� �ڵ���� ����Ǵ� �޸�

// static ���ľ�
// 1) ��� ���� �Ǵ� �޼ҵ带 ����(����)�� �� ���
//	- �ν��Ͻ� ���� ������ ���α׷��� ó�� ���۵� �� static �޸� ����(Method)�� �ڵ����� ����
// 2) Ŭ���� ����(static ����) : static���� ������ ��� ����
// - �ν��Ͻ��� �������� �ʾƵ� ��� ����
// - static ������ �����Ǵ� ��� �ν��Ͻ����� �����ϰ� ��!
// - Ŭ�����̸�.�����̸� �������� ���

// 3)�ν��Ͻ� ���� : static�� �������� �������
// - �ν��Ͻ��� ������ �Ŀ��� ����� �� �ִº���
// - ��������.�����̸� �������� ��� 

// 4) Ŭ���� �޼ҵ�(static �޼ҵ�) : static���� ������ �޼ҵ�
// - �ν��Ͻ��� �������� �ʾƵ� ��� ������ �޼ҵ�
// - Ŭ�����̸�.�����̸� �������� ���

// 5) �ν��Ͻ� �޼ҵ� : static�� ���� ���� �޼ҵ�
// - �ν��Ͻ��� ������ �Ŀ��� ����� �� �ִ� �޼ҵ�
// - ��������.�޼ҵ�() �������� ���

public class TestStatic {
	int num1; // �ν��Ͻ� ��� ����
	static int num2; // Ŭ���� ��� ����
	
	// �ν��Ͻ� �޼ҵ�
	public void display1() {
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
	}
	
	// Ŭ����(static) �޼ҵ�
	public static void display2() {
		// static �޼ҵ�� �ν��Ͻ� ���� ���� ��� ������
		// �׷���, �ν��Ͻ� ��� ������ �ν��Ͻ��� ������ �Ŀ��� ��밡��
		// �׷���, static �޼ҵ忡�� static�� �ƴ� ��� ���� ������ �Ұ���
//		System.out.println("num1 = " + num1); // �����߻�
		System.out.println("num2 = " + num2);
	}

} // end TestStatic