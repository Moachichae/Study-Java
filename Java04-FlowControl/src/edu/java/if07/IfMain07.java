package edu.java.if07;

import java.util.Scanner;

public class IfMain07 {

	public static void main(String[] args) {
		System.out.println("if 중첩문 연습");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		if (num % 2 == 0) { // 짝수일 때
			System.out.println("짝수");
			if (num % 4 == 0) { // 4의 배수
				System.out.println("4의 배수");
			} else { // 4의 배수가 아닐때
				System.out.println("4의 배수가 아닌 짝수");
			}
			
		} else { // 홀수일 때
			System.out.println("홀수");
		}

	} // end main()

} // end IfMain07
