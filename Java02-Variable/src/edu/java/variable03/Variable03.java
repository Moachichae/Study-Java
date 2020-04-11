package edu.java.variable03;

// 자바의 기본 자료형
// - 논리형 : boolean(1바이트)
// - 정수형 
//       byte(1바이트), short(2바이트), int(4바이트)
//       long(8바이트), char(2바이트)
// - 실수형 :
//       float(4바이트), double(8바이트)
public class Variable03 {

	public static void main(String[] args) {
		System.out.println("자바의 기본 자료형");
		byte n1 = 5;
		System.out.println("n1 =" +n1);
		
       // Ctrl+ / : 코드 주석 처리 및 주석 해제	
//		n1 = 128;
       //  byte 타입에 저장할 수 있는 범위를 넘어서는 수는 저장할 수 없음
		
		short n2 = 1234;
		System.out.println("n2=" +n2);
//		n2 = 32768;
		//short 타입에는 -32,768 ~ 32767까지만 저장 가능
		
	} // end main() 

} // end VariableMain03
