package edu.java.access09;

// final ���ľ�
// - final : ��������, ������ �� ����
// - �ʱ�ȭ�� ���� �ٲ� �� ����.
// - final + ��� ���� , �������� => ���(�ѹ� �ʱ�ȭ�� ���� ������ �� ���� ����)
// - final + �޼ҵ� : override �Ҽ� ���� �޼ҵ�
// - final + Ŭ���� : ����� ������� �ʴ� Ŭ����
public class AccessMain09 {
	public static final int MENU_INSERT = 1;
	public static final int MENU_DELETE = 2;
	public static int test = 100;
	

	public static void main(String[] args) {
		int x = 10;		
		final int y = 10; // final : �� �̻� �ٲ� �� ����
		
		x = 123;
//		y = 100;
		// �Ϲ����� ���� ������ �ʱ�ȭ ���Ŀ��� �������� ���� ���� ����
		// final ������ ó�� �ʱ�ȭ�� ���� ������ �� ����
		
		test = 200;
		// final�� �ƴ� ��� ������ ������ �ʱⰪ ���� ����
		
		
		System.out.println(Math.PI);
	} // end main() 

} // end AccessMain09














