package edu.java.if03;

import java.util.Scanner;

public class IfMain03 {

	public static void main(String[] args) {
		System.out.println("if-else ���� ���׿�����");
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		int x = sc.nextInt();
		System.out.println("�ι�° ���� �Է� : ");
		int y = sc.nextInt();
		System.out.println("�Է��� �� : "+ x + "," + y );
		

		sc.close();
		int big;
		
		if (x > y) {
			big = x;
		} else {
			big = y;
		}
		
		System.out.println("ū�� :" + big);
		
		System.out.println("=======================");
		
		// ���׿����� : (���ǽ�) ? (��1) : (��2)
		// (���ǽ�)�� ���̸� (��1)�� ����
		// (���ǽ�)�� �����̸� (��2)�� ����
		int big2 = (x>y) ? x : y;
		System.out.println("big2 =" + big2);
		
		

	} // end main()

} // end IfMain03
