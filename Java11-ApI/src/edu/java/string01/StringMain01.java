package edu.java.string01;

public class StringMain01 {

	public static void main(String[] args) {
		String str1 = "�ȳ��ϼ���";
		System.out.println(str1);
		System.out.println("���ڿ��� ����: " + str1.length());
		
		System.out.println();
		String str2 = new String("�ȳ��ϼ���");
		System.out.println(str2);
		
		if (str1 == str2) { // �ּҰ� ��
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
		// String�� �����ϴ� ���� �������� ���ڿ��� �ִ� �ּҰ��� �����
		// �񱳿�����(==, !=)�� �ܼ� �ּҰ��� ��
		// -> ���� ���ڿ��� ������ ������ '�ּҰ��� �ٸ���'��� ����� �� �� ����
		// ���ڿ��� ������ ���� �� �ٸ� �� ���� ���� equals() �޼ҵ带 ����ϸ� ��
		
		if (str1.equals(str2)) { // ���� ��
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}

	} // end main()

} // end StringMain01







