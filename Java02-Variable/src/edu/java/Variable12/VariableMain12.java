package edu.java.Variable12;

import java.util.Scanner;

public class VariableMain12 {

	public static void main(String[] args) {
		// Scanner ���� ������ ��
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("���� �Է� :");
		double age = sc.nextInt();
		System.out.println("age=" + age);
		
		sc.nextLine();
		// ���̸� �Է��ϰ� ���͸� ġ��
		// ���͸� ���ڷ� �ν��ؼ� �ڿ� �̸� �Է��� ������� ����
		// ���� ���͸� �������ִ� �ڵ尡 �ʿ���
		
		System.out.println("�̸� �Է� :");
		String name = sc.nextLine();
		System.out.println("name:" + name);
		
		sc.close();
		

	}

}
