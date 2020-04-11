package edu.java.variable02;

public class VariableMain2 {

	public static void main(String[] args) {
		System.out.println("변수 선언,초기화 연습");
		
		// 1. 국어, 영어, 수학 점수 변수선언
		int korean, english, math;
		
		
		// 2. 각 점수 저장
		korean = 90;
		english = 70;
		math = 95;
				
		
		// 3. 각 점수 출력
		System.out.println("국어:"+ korean);
		System.out.println("영어:"+ english);
		System.out.println("수학:"+ math);
		
		// 4. 각 점수의 합(변수 선언해서 저장 및 출력)
		int add = korean + english + math;
		System.out.println("각 점수의 합:"+add);
		
		// 5. 점수의 평균 변수 선언 및 저장, 출력
		int average = add/3;
		System.out.println("평균:"+average);		

	}

}
