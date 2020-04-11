package edu.java.access07;

import edu.java.access06.TestPublic;

public class AccessMain07 {

	public static void main(String[] args) {
		// edu.java.access06. TestPublic의 인스턴스 생성 가능
		// Ctrl + Shift + O : import 정리 단축키
		TestPublic test1 = new TestPublic();
		
//		TestPackage test2 = new TestPackage();
		// edu.java.access06. TestPackage는
		// (package) 클래스이므로 다른 패키지에 속한 클래스에서는 인스턴스 생성이 불가능

	} // end main()

} // end AccessMain07
