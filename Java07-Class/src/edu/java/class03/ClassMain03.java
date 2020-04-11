package edu.java.class03;

public class ClassMain03 {

	public static void main(String[] args) {
		// 기본생성자를 사용하여, MyCircle 클래스의 인스턴스 생성
		MyCircle circle1 = new MyCircle();
		System.out.println("반지름 : " + circle1.radius);
		System.out.println("넓이 : " + circle1.calcArea());
		
		// circle1 객체의 반지름 1.0 값을 저장하여 반지름 ,면적 출력
		circle1.radius = 4;		
		System.out.println("반지름 : " + circle1.radius);
		System.out.println("넓이 : " + circle1.calcArea());
		
		System.out.println("=============");
		
		// 2. 매개변수가 있는 생성자애 10.0을 값으로 주고
		// MyCircle 클래스 인스턴스를 생성한 다음, 반지름, 면적 출력하기
		MyCircle circle2 = new MyCircle(10.0);		
		System.out.println("반지름 : " + circle2.radius);
		System.out.println("넓이 : " + circle2.calcArea());
		
		
		
	} // end main()

} // end ClassMain03
