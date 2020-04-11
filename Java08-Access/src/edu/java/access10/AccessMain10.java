package edu.java.access10;

public class AccessMain10 {
	public static void test1() {
		System.out.println("테스트 1");
	} // end test1()
	
	public void test2() {
		System.out.println("테스트 2");
	} // end test2()
	
	public static void main(String[] args) {
		test1();
		AccessMain10.test1();
		
//		test2();
		AccessMain10 prog = new AccessMain10();
		prog.test2();
		
		
//		TestStatic.num1; // 인스턴스 생성이 없으면 사용 불가 - 인스턴스 멤버변수
		TestStatic.num2 = 123; // 인스턴스 생성 없이 사용 가능 - static(클래스) 멤버변수
		System.out.println(TestStatic.num2);
		
		// static 메소드 - 인스턴스 생성 없이 사용 가능
		TestStatic.display2();

	} // end main()

} // end AccessMain10

















