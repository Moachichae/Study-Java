package edu.java.if04;

import java.util.Scanner;

public class IfMain04 {

	public static void main(String[] args) {
		// Ctrl + Shift + F �ڵ� �� ����
		System.out.println("if - else if - else��");
		// if(����1) { ����A }
		// else if(����2) { ����B }
		// ...
		// else { ����C }
		// - ����1�� ���� ��� ����A, ����2�� ���� ��� ����B, �� �� �ƴ� ��� ����C�� ����
		// - else if���� 1�� �̻� �ۼ� ����

		// 1. ���� �ϳ��� �Է¹���
		// 2. 0���� ũ�� ���, 0�̸� "0", 0���� ������ "����"�� ����ϴ� �ڵ� �ۼ�

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("���");
		} else if (a == 0) {
			System.out.println("0");
		} else {
			System.out.println("����");
		}
		sc.close();

	} // end main()

} // end IfMain04
