package edu.java.while04;

import java.util.Scanner;

public class WhileMain04 {

	public static void main(String[] args) {
		System.out.println("while������ �Է� �ޱ�");
		// while ���� Scanner �� �̿��Ͽ� ����, ���, ��ȸ, ���� ���� �����ϴ� �ڵ� �ۼ�
		Scanner sc = new Scanner(System.in);
		int balance = 0; // ���� �ܰ�
		boolean run = true; // while���� �ݺ� ���� �˻�
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("---------------------------");
			System.out.println("����>");
			
			int input = sc.nextInt();
			switch(input) {
			case 1:
				System.out.println("���ݾ�>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.println("�ܰ�>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
			case 4:
				System.out.println("�����մϴ�");
				run = false;
				break;
			default :
				System.out.println("�ùٸ� �޴��� �����ϼ���");
		  } // end switch
		} // end while
		
		sc.close();
		System.out.println("���α׷� ����");

	} // end main()

} // end WhileMain04
