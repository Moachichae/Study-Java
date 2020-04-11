package edu.java.if06;

import java.util.Scanner;

public class IfMain06 {

	public static void main(String[] args) {
		System.out.println("if-else 문자 조건 연습");
		// 문자 하나를 입력받아서 그 글자가
		// 1) A ~ Z이면, "영대문자"라고 출력
		// 2) a ~ z이면, "영소문자"라고 출력
		// 3) 0 ~ 9이면, "숫자"라고 출력
		// 4) 그 외 경우는, "몰라요"라고 출력
		
		// 문자 하나 입력받는 방법
		// sc.nextLine()으로 문자열을 입력 받는다.
		// 문자열에서 첫글자를 추출한다.
		
		Scanner sc = new Scanner(System. in);
		System.out.println("문자를 입력하세요");
		String str = sc.nextLine();
		char ch = str.charAt(0);
		System.out.println("첫글자 종류 : ");
		
		if ('a'<= ch && ch<='z') { System.out.println("영소문자");			
		} else if ('A'<= ch && ch<='Z') {
			System.out.println("영대문자");
		} else if ('0' <= ch && ch <='9') {
			System.out.println("숫자");
		}
		else {System.out.println("몰라요");
		}
		sc.close();

	} // end main()

} // end IfMain06
