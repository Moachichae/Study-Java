package edu.java.switch02;

import java.util.Scanner;

public class SwitchMain02 {

	public static void main(String[] args) {
		System.out.println("switch�� ����");
		
		// ��/�ҹ��� ���о��� �Էµ� a, b, c�� ���� ��� ���
		Scanner sc = new Scanner(System.in);
		char grade = sc.nextLine().charAt(0);
		
		switch (grade) {
		case 'A' :
		case 'a' :
			System.out.println("��� ȸ���Դϴ�.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("�Ϲ� ȸ���Դϴ�.");
			break;
		default :
			System.out.println("�մ��Դϴ�.");
			break;
		}
		sc.close();
		
//		if(grade == 'A' || grade == 'a')

	} // end main()

} // end SwitchMain02
