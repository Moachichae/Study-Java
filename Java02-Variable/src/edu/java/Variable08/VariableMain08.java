package edu.java.Variable08;

import java.util.Scanner;

public class VariableMain08 {

	public static void main(String[] args) {
		System.out.println("변수 입력");
		
		// 입력을 받기 위한 변수는 Scanner 선언
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("국어 점수 : " + kor);
		
		System.out.println();
		System.out.println("실수 입력 : ");
		double x = sc.nextDouble();
		System.out.println("x=" + x);
		
		sc.close(); // 스캐너의 사용을 종료
		
		

	} // end main()

} // end Variable08

