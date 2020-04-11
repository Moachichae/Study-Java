package edu.java.if03;

import java.util.Scanner;

public class IfMain03 {

	public static void main(String[] args) {
		System.out.println("if-else 문과 삼항연산자");
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 : ");
		int x = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int y = sc.nextInt();
		System.out.println("입력한 수 : "+ x + "," + y );
		

		sc.close();
		int big;
		
		if (x > y) {
			big = x;
		} else {
			big = y;
		}
		
		System.out.println("큰수 :" + big);
		
		System.out.println("=======================");
		
		// 삼항연사자 : (조건식) ? (값1) : (값2)
		// (조건식)이 참이면 (값1)을 선택
		// (조건식)이 거짓이면 (값2)를 선택
		int big2 = (x>y) ? x : y;
		System.out.println("big2 =" + big2);
		
		

	} // end main()

} // end IfMain03
