package edu.java.if02;

import java.util.Scanner;

public class IfMain02 {

	public static void main(String[] args) {
		System.out.println("if-else ��");
		// if(����) {����A}
		// else {����B}
		// - ������ ���̸� ����A�� ����ǰ� �����̸� ����B�� ����
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("���");
		} else {
			System.out.println("0���� ũ�� ����");
		}
		
		if (x !=0) {
			System.out.println("0�� �ƴ� ����");
		} else {
			System.out.println("0�Դϴ�.");
		}
		sc.close(); 

	} // end main()

} // end IfMain02
