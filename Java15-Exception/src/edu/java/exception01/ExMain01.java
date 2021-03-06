package edu.java.exception01;

// 컴파일 에러 : 소스코드 빌드 시 발생하는 에러
// -> 실행 파일이 만들어지지 않기 때문에 실행할 수 없음
// 예외(Exception) :
// -> 소스코드를 빌드할 때는 에러가 없었지만,
//	  실행 파일을 실행할 대 발생하는 오류
// 논리적 오류 :
// -> 컴파일 에러도 없고, 실행할 때 예외도 발생하지 않지만
//	  논리적인 문제 때문에 원하는 실행 결과가 나오지 않는 경우

public class ExMain01 {

	public static void main(String[] args) {
//		int 123; // 컴파일 에러
		
//		int n = 123 / 0; // 예외 수학적으로 123을 0으로 나눌수없음 
		//(Exception in thread "main" java.lang.ArithmeticException: / by zero)
		
		int result = findMax(20,1);
		System.out.println("result = " + result);

	} // end main()
	
	public static int findMax(int x, int y) {
		return (x < y)? x : y;
	} // 논리적 오류 
	// 실행결과상으론 문제가 없지만 최대값을 찾는 메소드를 만들었는데 return 값은 논리적으로 맞지않음

} // end ExMain01


















