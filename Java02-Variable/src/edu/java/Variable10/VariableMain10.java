package edu.java.Variable10;

import java.util.Scanner;

public class VariableMain10 {

	public static void main(String[] args) {
		System.out.println("�ʰ��� ����");
		// double Ÿ���� ���� 2���� �Է� �޾Ƽ� ����
		// �� ���� ��Ģ����(+,-,*,/)�� ����� ���
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է� :");
		double x = sc.nextDouble();
		System.out.println("x=" + x);
		
		System.out.println("�ι�° ���� �Է� :");
		double y = sc.nextDouble();
		System.out.println("y=" + y);
		
		sc.close();
		
		double result; // ����� ����
		result = x + y;
		System.out.println(x + "x" + y + "=" + result);
		
		result = x - y;
		System.out.println(x + "-" + y + "="+ result);
		
		result = x * y;
		System.out.println(x + "*" + y + "="+ result);
		
		result = x / y;
		System.out.println(x + "/" + y + "="+ result);
		
		
		
	} // end main()

} // end VariableMain10
