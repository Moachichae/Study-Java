package edu.java.Variable08;

import java.util.Scanner;

public class VariableMain08 {

	public static void main(String[] args) {
		System.out.println("���� �Է�");
		
		// �Է��� �ޱ� ���� ������ Scanner ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("���� ���� : " + kor);
		
		System.out.println();
		System.out.println("�Ǽ� �Է� : ");
		double x = sc.nextDouble();
		System.out.println("x=" + x);
		
		sc.close(); // ��ĳ���� ����� ����
		
		

	} // end main()

} // end Variable08

