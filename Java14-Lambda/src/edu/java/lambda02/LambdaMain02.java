package edu.java.lambda02;

@FunctionalInterface
interface Test1{
	public abstract void testPrint();
} // end Test1

@FunctionalInterface
interface Test2{
	public abstract void testPrint(int n);	
} // end Test2

public class LambdaMain02 {

	public static void main(String[] args) {
		// �͸�Ŭ����, ���� ǥ���� ����
		// ����(lambda) ǥ���� :
		// (�Ű�����1,�Ű�����2, ....) -> {���๮; ����;}
		// �������̽� �����̸� = ���� ǥ����;
		
		// "�͸� Ŭ���� ����!"�� ����ϴ� �͸� Ŭ���� �����ϱ�.
		Test1 test1 = new Test1() {
			@Override
			public void testPrint() {
				System.out.println("�͸� Ŭ���� ����!");				
			}
			
		};
		test1.testPrint();
		
		
		
		// "���� ǥ���� ����!"�� ����ϴ� ���� ǥ���� ���� �� ����ϱ�
		Test1 test2 = () -> {
			System.out.println("���� ǥ���� ���� ");
		};
		test2.testPrint();
		
		
		// "�Է��� ���ڴ� : 100"�� ����ϴ� �͸� Ŭ���� ���� �� ����ϱ�.
		Test2 test3 = new Test2() {

			@Override
			public void testPrint(int n) {
				System.out.println("�Է��� ���ڴ� : " + n);				
			}			
		};
		test3.testPrint(100);
		
		
		// "�Է��� ���� : 200"�� ����ϴ� ���� ǥ���� ���� �� ����ϱ�.
		Test2 test4 = (n) -> {
			System.out.println("�Է��� ���� : " + n);
		};
		test4.testPrint(200);
				
				
				
				

	} // end main()

} // end LambdaMain02
