package edu.java.exception05;

public class ExMain05 {

	public static void main(String[] args) {
		// �ϳ��� try �������� ���� ���� catch�� ����ϴ� ��� 1
		try {
			int x = 12345;
			int y = 0;
			int result = x / y;
			System.out.println("result = " + result);
			
			int[] array = new int[10];
			array[10] = 1000;
			System.out.println("array[0] = " + array[0]);
			
			String name = null;
			System.out.println("���ڿ� ���� : " + name.length());
		} catch (ArithmeticException e) { 
			System.out.println("������� ���� : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ε��� ���� : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		}
		
		// �ϳ��� try �������� ���� ���� catch�� ����ϴ� ���,
		// �ڽ� Ŭ������ Exception�� ���� catch �������� ����ϰ�,
		// ���� �������� �ֻ��� �θ� Ŭ������ Exception�� ����ؾ� ��
		System.out.println("���α׷� ����");
		
			
		
		
		
	} // end main()

} // end ExMain05
