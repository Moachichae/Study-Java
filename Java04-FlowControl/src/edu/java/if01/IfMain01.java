package edu.java.if01;

import java.util.Scanner;

// �帧 ����(Flow Control)
// - ���α׷��� ���� �帧�� �����ڰ� ���ϴ� �������� �ٲ� �� ����
// - ����̶�� �θ�
// - ������� ���ǹ��� �ݺ����� ����
// - ���ǹ� : if, if-else, if-else if-else switch
// - �ݺ��� : for, while, do-while
public class IfMain01 {

	public static void main(String[] args) {
		System.out.println("if��");
		
		// if(����) { ���� }
		// ������ ��(true)�� ������ ����
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if (score >= 90) {
			System.out.println("������ 90�� �̻��Դϴ�");
			System.out.println("����� A�Դϴ�.");
		}
		
		if (score < 90) {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
	
		sc.close();
		

	} // end main()

} // end IfMain01
