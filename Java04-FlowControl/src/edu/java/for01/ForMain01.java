package edu.java.for01;

// for 반복문
// - 반복 수행을 하기 위한 키워드
// - for(초기식; 조건식; 증감식) {
//        (본문)
//   }
// - 초기값을 증감시켜서 조건식이 false가 될 때까지 본문을 반복
// - 실행 순서
//    1) 초기식. 2) 조건식. 3) 본문. 4) 증감식

public class ForMain01 {

	public static void main(String[] args) {
		System.out.println("for 반복문");
		for (int x = 1; x <= 10; x++) {
			System.out.println("Java" + x);
		}
		
		System.out.println("====================");
		// 1, 2, 3, 4, .... 15를 출력
		for (int x = 1; x <= 15; x++) {
			System.out.println("Java" + x);
		}
		
		// 15, 14, 13, 12, ... 1을 출력
		for (int x = 15; x>=1 && x <= 15 ; x--) {
				System.out.println("Java" + x);
		}
		
		
		
	} // end main()

} // end ForMain01
