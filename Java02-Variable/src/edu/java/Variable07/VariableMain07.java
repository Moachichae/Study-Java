package edu.java.Variable07;

// char : 문자 하나를 저장하는 데이터 타입, 2바이트
// - 문자의 유니코드 값(0 또는 양의정수)를 저장하는 타입
// - 0 ~ 65,535
// - 문자(character)는 작은 따옴표('')를 사용
// - 문자열(string)은 큰 따옴표("")를 사용
// '한', '글','': 문자(character) 리터럴
// - "한글", "한국", "" : 문자열(string) 리터럴
public class VariableMain07 {

	public static void main(String[] args) {
		System.out.println("문자 타입(char)");
		
		char ch1 = 'A';
		System.out.println("ch1 = "+ch1); // 문자 자체 출력
		System.out.println("ch1 = "+(int)ch1); // 문자의 코드값 출력 (강제 형 변환)
		
		char ch2 = 'B';
		System.out.println("ch2 = "+ch2); // 문자 자체 출력
		System.out.println("ch2 = "+(int)ch2); // 문자의 코드값 출력 
		
		char ch3 = '1';
		System.out.println("ch3 = "+ch3); // 문자 자체 출력
		System.out.println("ch3 = "+(int)ch3); // 문자의 코드값 출력

		char ch4 = 1;
		System.out.println("ch4 = " + ch4);
		System.out.println("ch4 = " + (int)ch4);
		
		// (char)ch3 + 2
		ch4 = (char)(ch3 + 2);
		System.out.println(ch4);
		
		
		// 문자 끼리 비교 가능
		boolean b = '가' < '나';
		System.out.println("b="+b);
		
		
	} // end main()

} // end VariableMain07
