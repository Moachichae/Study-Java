package edu.java.rps01;

import java.util.Scanner;

public class GameMain01 {

	public static void main(String[] args) {
		// RPS(Rock, paper, Scissors)
		
		// ���������� ����
		// 1. ����ڿ��� ����(1), ����(2), ��(3) �߿��� �����ϵ��� �ϰ�, ���� ��� ����
		// 2. ��ǻ�ʹ� ����(1, 2, 3)�� �߻����Ѽ� ����
		// 3. ������ ����
		// 1) if ����ڰ� ����(1)�� ���� ��
		//     (1) if ��ǻ�Ͱ� ����(1)�� ���� ��
		//     (2) else if ��ǻ�Ͱ� ����(2)�� ���� ��
		//     (3) else
		// 2) else if ����ڰ� ����(2)�� ���� ��
		//     (1) if ��ǻ�Ͱ� ����(1)�� ���� ��
		//     (2) else if ��ǻ�Ͱ� ����(2)�� ���� ��
		//     (3) else
		// 3 else (����ڰ� ���� �� ���)
		//     (1) if ��ǻ�Ͱ� ����(1)�� ���� ��
		//     (2) else if ��ǻ�Ͱ� ����(2)�� ���� ��
		//     (3) else
		
		double r = Math.random();
		int choice = (int)(3*r+1);
//		System.out.println(choice);
		
		// 1. ������� ����(����, ����, ��)�� �Է¹޾Ƽ� ����
		Scanner sc = new Scanner(System.in);
		int userChoice = sc.nextInt();
		sc.close();
		System.out.println("userChoise" + userChoice);
		
		// 2. ��ǻ���� ������ ������ ����
		
		sc.close();
		int comChoice = choice;
		System.out.println("comChoise" + comChoice);
		
		// 3. ������ ����
		// ����ڰ� ������ �� ���
		if(userChoice == 1) { 
			
			if(comChoice == 1) {// ��ǻ�Ͱ� ������ �� ���
				System.out.println("�����ϴ�.");
			} else if (comChoice == 2) { // ��ǻ�Ͱ� ������ �� ���
				System.out.println("����� �����ϴ�.");
			} else { // ��ǻ�Ͱ� ���� �� ���
				System.out.println("����� �̰���ϴ�.");
			}
			
		} else if (userChoice == 2) { // ����ڰ� ������ �����
			
			if(comChoice == 1) {// ��ǻ�Ͱ� ������ �� ���
				System.out.println("����� �̰���ϴ�.");
			} else if (comChoice == 2) { // ��ǻ�Ͱ� ������ �� ���
				System.out.println("�����ϴ�.");
			} else { // ��ǻ�Ͱ� ���� �� ���
				System.out.println("����� �����ϴ�.");
			}
			
		} else { // ����ڰ� ���� �� ���
			
			if(comChoice == 1) {// ��ǻ�Ͱ� ������ �� ���
				System.out.println("����� �����ϴ�.");
			} else if (comChoice == 2) { // ��ǻ�Ͱ� ������ �� ���
				System.out.println("����� �̰���ϴ�.");
			} else { // ��ǻ�Ͱ� ���� �� ���
				System.out.println("�����ϴ�.");
			}
			
		}

	} // end main()

} // end GameMain01


























