package edu.java.if06;

import java.util.Scanner;

public class IfMain06 {

	public static void main(String[] args) {
		System.out.println("if-else ���� ���� ����");
		// ���� �ϳ��� �Է¹޾Ƽ� �� ���ڰ�
		// 1) A ~ Z�̸�, "���빮��"��� ���
		// 2) a ~ z�̸�, "���ҹ���"��� ���
		// 3) 0 ~ 9�̸�, "����"��� ���
		// 4) �� �� ����, "�����"��� ���
		
		// ���� �ϳ� �Է¹޴� ���
		// sc.nextLine()���� ���ڿ��� �Է� �޴´�.
		// ���ڿ����� ù���ڸ� �����Ѵ�.
		
		Scanner sc = new Scanner(System. in);
		System.out.println("���ڸ� �Է��ϼ���");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.println("ù���� ���� : ");
		
		if ('a'<= ch && ch<='z') { System.out.println("���ҹ���");			
		} else if ('A'<= ch && ch<='Z') {
			System.out.println("���빮��");
		} else if ('0' <= ch && ch <='9') {
			System.out.println("����");
		}
		else {System.out.println("�����");
		}
		sc.close();

	} // end main()

} // end IfMain06
