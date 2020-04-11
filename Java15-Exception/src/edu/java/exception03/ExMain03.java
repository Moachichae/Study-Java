package edu.java.exception03;

public class ExMain03 {

	public static void main(String[] args) {
		try {
			System.out.println("try 내부");
			int[] array = new int[10];
//			array[13] = 100; // 예외 발생 -> catch로 이동 
			System.out.println(array[10]);
		} catch (Exception e) {
			System.out.println("예외 메시지 : " + e.getMessage());
		}
		
		System.out.println("프로그램 종료");
		// 논리적 에러는 try문이 잡지못함 개발자가 직접 if문 작성
		

	} // end main()

} // end ExMain03
