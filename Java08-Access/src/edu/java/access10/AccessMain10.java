package edu.java.access10;

public class AccessMain10 {
	public static void test1() {
		System.out.println("�׽�Ʈ 1");
	} // end test1()
	
	public void test2() {
		System.out.println("�׽�Ʈ 2");
	} // end test2()
	
	public static void main(String[] args) {
		test1();
		AccessMain10.test1();
		
//		test2();
		AccessMain10 prog = new AccessMain10();
		prog.test2();
		
		
//		TestStatic.num1; // �ν��Ͻ� ������ ������ ��� �Ұ� - �ν��Ͻ� �������
		TestStatic.num2 = 123; // �ν��Ͻ� ���� ���� ��� ���� - static(Ŭ����) �������
		System.out.println(TestStatic.num2);
		
		// static �޼ҵ� - �ν��Ͻ� ���� ���� ��� ����
		TestStatic.display2();

	} // end main()

} // end AccessMain10

















