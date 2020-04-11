package edu.java.if04;

import java.util.Scanner;

public class IfMain04 {

	public static void main(String[] args) {
		// Ctrl + Shift + F 자동 줄 맞춤
		System.out.println("if - else if - else문");
		// if(조건1) { 본문A }
		// else if(조건2) { 본문B }
		// ...
		// else { 본문C }
		// - 조건1이 참일 경우 본문A, 조건2가 참일 경우 본문B, 둘 다 아닐 경우 본문C가 실행
		// - else if절은 1개 이상 작성 가능

		// 1. 정수 하나를 입력받음
		// 2. 0보다 크면 양수, 0이면 "0", 0보다 작으면 "음수"를 출력하는 코드 작성

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a > 0) {
			System.out.println("양수");
		} else if (a == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		sc.close();

	} // end main()

} // end IfMain04
