package edu.java.access01;

public class AccessMain01 {

	public static void main(String[] args) {
		// Test01 Ŭ������ �ν��Ͻ� ����
		Test01 t1 = new Test01();
		t1.display();
//		t1.n1 = 100; // ������ ����
		// private ��� ������ �ٸ� Ŭ�������� ���� ������ �Ұ���(������ ����)
		// -> ���� �����ϰų� �о���� ����
		t1.n2 = 200;	// (package) : ���� ��Ű���� �ֱ� ������ ���ٰ���
		t1.n3 = 300;	// protected : ���� ��Ű���� �ֱ� ������ ���� ��
		t1.n4 = 400;	// public : ��𼭵��� ���� ����
		t1.display();
		
		
		

	} // end main()

} // end AccessMain01
