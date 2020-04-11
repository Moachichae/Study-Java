package edu.java.exception06;

public class ExMain06 {

	public static void main(String[] args) {
		// �ϳ��� try �������� ���� ���� catch�� ����ϴ� ���2 : Java 7��������
		// try{
		//	���� ��Ȱ�� �� ������ �ڵ�;
		// } catch (Ex1 | Ex2 | Ex3 ... e){
		//	���� ��Ȳ�� �� ������ �ڵ�;
		// } catch (Exception e) {...}
		// ����(Exception)�� �������� ������ ���� �θ� ���� Ŭ������ ���ԵǸ� �ȵ�
		// �ֻ��� ���� Ŭ����(Exception)�� �׻� �������� catch ���������� ���
		
		try {
			System.out.println("try ����");
			int result = 123 / 10;
			int [] array = new int[10];
			array[10] = 10;
			System.out.println("try ��");
		} catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("���� : " + e.getMessage());
		} catch(Exception e) {
			System.out.println("���� : " + e.getMessage());
		}
		
		
		

	} // end main()

} // end ExMain06
