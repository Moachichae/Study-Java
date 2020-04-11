package edu.java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		Contact c1 = new Contact("아이유","010-3242-444","iu@gmail.com");
		c1.displayInfo();
		
		System.out.println();
		c1.setPhone("010-2222-333");
		c1.displayInfo();
		
		System.out.println();
		Contact c2 = new Contact();
		// 본인이 좋아하는 연예인의 이름, 전화번호, 이름을 넣어서
		// displayInfo()로 출력해주세요.
		c2.setName("지수");
		c2.setPhone("010-3433-6432");
		c2.setEmail("gs@gamail.com");
		c2.displayInfo();
		

	} // end main()

} // end AccessMain04
