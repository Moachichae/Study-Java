package edu.java.Variable09;

import java.util.Scanner;


public class VariableMain09 {

	public static void main(String[] args) {
		System.out.println("���� ��� ���α׷�");
		
		// Ű����� ��/��/�� ������ �Է¹޾Ƽ�
		// ������ ����� ����ϴ� ���α׷� �ۼ�
		
		// 1. �Է¹����غ� : Scanner �غ�
		Scanner sc = new Scanner(System.in);
		
		// 2. ����, ����, ���� ������ int�� �Է¹޾Ƽ� ����
		System.out.println("���� ���� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("���� :"+ kor);
		
		System.out.println("���� ���� �Է� : " );
		int math = sc.nextInt();
		System.out.println("���� : " + math);
		
		System.out.println("���� ���� �Է� : ");
		int english = sc.nextInt();
		System.out.println("����:" + english);
		
		// 3. ����, ����, ���� ������ ���
		
		// 4. ������ ����ؼ� ���
		int total = kor+math+english;
		System.out.println("���� : "+ total);
		// 5. ����� ����ؼ� ���(�Ҽ��� ��°�ڸ�����)
		
		 double average = total / 3.0;
		System.out.printf("��� : %.3f", average);
		sc.close();
		// ����) ���� / �Ǽ� -> �Ǽ����� ������
	
		// ���� 1/2.0 = 0.5

	}

}
