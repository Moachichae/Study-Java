package edu.java.Variable09;

import java.util.Scanner;


public class VariableMain09 {

	public static void main(String[] args) {
		System.out.println("총점 계산 프로그램");
		
		// 키보드로 국/영/수 점수를 입력받아서
		// 총점과 평균을 출력하는 프로그램 작성
		
		// 1. 입력받을준비 : Scanner 준비
		Scanner sc = new Scanner(System.in);
		
		// 2. 국어, 영어, 수학 점수를 int로 입력받아서 저장
		System.out.println("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("국어 :"+ kor);
		
		System.out.println("수학 점수 입력 : " );
		int math = sc.nextInt();
		System.out.println("수학 : " + math);
		
		System.out.println("영어 점수 입력 : ");
		int english = sc.nextInt();
		System.out.println("영어:" + english);
		
		// 3. 국어, 영어, 수학 점수를 출력
		
		// 4. 총점을 계산해서 출력
		int total = kor+math+english;
		System.out.println("총점 : "+ total);
		// 5. 평균을 계산해서 출력(소수점 셋째자리까지)
		
		 double average = total / 3.0;
		System.out.printf("평균 : %.3f", average);
		sc.close();
		// 참고) 정수 / 실수 -> 실수값을 돌려줌
	
		// 예시 1/2.0 = 0.5

	}

}
