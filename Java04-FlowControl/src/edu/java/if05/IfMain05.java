package edu.java.if05;

import java.util.Scanner;

public class IfMain05 {

	public static void main(String[] args) {
		System.out.println("if - else if - else ����");

		// ������ ������ �Է� �޾Ƽ�
		// score�� 90�� �̻��̸� "A"�� ���
		// score�� 80�� �̻��̸� "B"�� ���
		// score�� 70�� �̻��̸� "C"�� ���
		// score�� 70�� �̸��̸� "F"�� ���

		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		System.out.println("���� �����?");

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		sc.close();

		
	}

}
