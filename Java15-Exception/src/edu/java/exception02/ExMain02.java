package edu.java.exception02;

import java.util.Scanner;

public class ExMain02 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		sc.close();
		
		if(n2 != 0) {
			int result = n1 / n2;
			System.out.println("result = " + result);		
		}else {
			System.out.println();
		}
		
		// ���� ó�� : try ����
		// try{
		//	  �������� ���� �����;
		// } catch (����Ŭ���� �����̸�) {
		//		���ܻ�Ȳ�� �� ������ �����
		// }
		
	System.out.println();
		
		try {
			System.out.println("try ����");
			int result = n1/n2;
			System.out.println("result = " + result);
		} catch(Exception e) { // ���� ��Ȳ
			System.out.println("���� �߻�!");
		}
		
		System.out.println("���α׷� ����");
		
		
		
	} // end main()

} // end ExMain02
