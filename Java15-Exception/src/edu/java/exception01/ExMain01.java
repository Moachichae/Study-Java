package edu.java.exception01;

// ������ ���� : �ҽ��ڵ� ���� �� �߻��ϴ� ����
// -> ���� ������ ��������� �ʱ� ������ ������ �� ����
// ����(Exception) :
// -> �ҽ��ڵ带 ������ ���� ������ ��������,
//	  ���� ������ ������ �� �߻��ϴ� ����
// ���� ���� :
// -> ������ ������ ����, ������ �� ���ܵ� �߻����� ������
//	  ������ ���� ������ ���ϴ� ���� ����� ������ �ʴ� ���

public class ExMain01 {

	public static void main(String[] args) {
//		int 123; // ������ ����
		
//		int n = 123 / 0; // ���� ���������� 123�� 0���� ���������� 
		//(Exception in thread "main" java.lang.ArithmeticException: / by zero)
		
		int result = findMax(20,1);
		System.out.println("result = " + result);

	} // end main()
	
	public static int findMax(int x, int y) {
		return (x < y)? x : y;
	} // ���� ���� 
	// ������������ ������ ������ �ִ밪�� ã�� �޼ҵ带 ������µ� return ���� �������� ��������

} // end ExMain01


















