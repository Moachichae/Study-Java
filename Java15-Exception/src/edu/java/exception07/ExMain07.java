package edu.java.exception07;

import java.util.Scanner;

public class ExMain07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// try{
		//	�������� ��쿡 ������ �ڵ��;
		// ] catch (Exception e) {
		//	���� ��Ȳ�� �� ������ �ڵ�;
		// } finally {
		//	�������� ����, ���� ��Ȳ�̵� ������� �׻� ������ �ڵ�
		// } 
		// (����) try ����̳� catch ��� �ȿ� return; �� �ִ���
		// return ���� ���� finally ����� ����ǰ�, �� �Ŀ� return�� �����!
		
		try {
			System.out.println("try ����");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a / b;
			System.out.println("try �� : result = " + result);
		} catch (Exception e) {
			System.out.println("���� : " + e.getMessage());
		} finally {
			System.out.println("finally : ���� ����ɱ��?");
			sc.close();
		}
		
		System.out.println("���α׷� ����");
		

	} // end main()

} // end ExMain07
