package edu.java.if07;

import java.util.Scanner;

public class IfMain07 {

	public static void main(String[] args) {
		System.out.println("if ��ø�� ����");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		if (num % 2 == 0) { // ¦���� ��
			System.out.println("¦��");
			if (num % 4 == 0) { // 4�� ���
				System.out.println("4�� ���");
			} else { // 4�� ����� �ƴҶ�
				System.out.println("4�� ����� �ƴ� ¦��");
			}
			
		} else { // Ȧ���� ��
			System.out.println("Ȧ��");
		}

	} // end main()

} // end IfMain07
