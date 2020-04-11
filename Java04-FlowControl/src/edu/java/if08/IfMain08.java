package edu.java.if08;

// SCE (Short-circuit evaluation : 짧은 계산)
// Laz Evaluation (게으른 계산)
// A && B 를 계산할 때 A가 false이면, B를 계산하지 않음
// A || B 를 계산할 때 A가 true이면, B를 계산하지 않음
public class IfMain08 {

	public static void main(String[] args) {
		System.out.println("계산 규칙 확인");
		
		int x = 0;
		int y = 0;
		
		if ((x += 10) < 0 && (y += 10) > 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		// x += 10 의 연산 결과 : x = 10
		// 10 < 0 의 연산 결과 : false
		// 앞쪽 연산이 false 이므로 y += 10은 계산되지 않음
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("==================");
		x = 0;
		y = 0;
		
		if((x += 10) > 0 || (y += 10) > 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		// x += 10 의 연산 결과 : x = 10
		// 10 > 0 의 연산 결과 : true
		// 왼쪽 연산 결과가 true이므로 y += 10은 계산되지 않음
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	} // end main()

} // end IfMain08
