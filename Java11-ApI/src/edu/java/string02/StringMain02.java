package edu.java.string02;

public class StringMain02 {

	public static void main(String[] args) {
		// String literal�� ������ ȣ���� ����
		// - �����ڴ� ȣ���� ������ ���ο� �ν��Ͻ��� ������(�ּҰ��� �ٸ�)
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		// -> ���� ����(str1, str2)���� �ٸ� �ּҰ��� �����
		if(str1 == str2) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
		
		// ���ڿ� ���ͷ��� ����ؼ� �ʱ�ȭ �ϴ� ���
		// ���ͷ��� ������ ���� �ν��Ͻ��� ���������� 
		// �̹� ���ͷ��� ������� �ִ� ����
		// �ν��Ͻ��� �������� �ʰ�, ������ �ν��Ͻ��� ��Ȱ��
		String str3 = "abc";
		String str4 = "abc";
		// -> ���� ����(str3, str4)�� ���� �ּҰ��� ����
		if (str3 == str4) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
	
		

	} // end main()

} // end StringMain02
















