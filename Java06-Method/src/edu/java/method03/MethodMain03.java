package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {
	
			
	
	public static void main(String[] args) {				
		
		// 1. ����, ����, ���� ������ �Է¹޾Ƽ� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("���� �Է� : ");
		int eng = sc.nextInt();
		System.out.println("���� �Է� : ");
		int math = sc.nextInt();
		// 2. �Է¹��� ���� ���
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		
		// 3. public static int calcTotal(int kor, int eng, int math) �޼ҵ带
		//    �����ϰ�, �Լ��� ȣ���Ͽ� �� ������ ������ ���
		int total = calcTotal(kor, eng, math);
		System.out.println("�հ� : " + total);
		// 4. public static double calcAverage(int total) �޼ҵ带 �����ϰ�
		//    �Լ��� ȣ���Ͽ� �� ������ ����� ���(�Ҽ������� ��Ȯ�ϰ�)
		double avg = calcAverage(total);
		// 5. public static char calcGrade(double avg) �޼ҵ带 �����ϰ�,
		//    �Լ��� ȣ���Ͽ� ����(100 ~ 90, 89 ~ 80, ..)�� ���� ���('A', 'B', 'C', 'F')�� ���
		char grade = calcGrade(avg);
		System.out.println("���� : " + grade);

	} // end main()
	 // �� ���� ������ ����ؼ� �����ϴ� �޼ҵ�
	 public static int calcTotal(int kor, int eng, int math) {
		 return kor + eng + math;
	 } // end calcTotal()
	 // ������ �޾Ƽ� ����� ����ϴ� �޼ҵ�
	 public static double calcAverage(int total) {
		 return total / 3.0;
	 } // end calAverage()
	 
	 // Alt + Shift + R = �̸� ���� ����Ű
	 
	 public static char calcGrade(double avg) {
		 char grade;
		 if(avg >= 90) {
			 grade = 'A';
		 } else if(avg >= 80) {
			 grade = 'B';
		 } else if(avg >= 70) {
			 grade = 'C';
		 } else {
			 grade = 'F';
		 }
		 return grade;
	 }


} // end MethodMain03
