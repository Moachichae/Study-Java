package edu.java.access04;

public class AccessMain04 {

	public static void main(String[] args) {
		Contact c1 = new Contact("������","010-3242-444","iu@gmail.com");
		c1.displayInfo();
		
		System.out.println();
		c1.setPhone("010-2222-333");
		c1.displayInfo();
		
		System.out.println();
		Contact c2 = new Contact();
		// ������ �����ϴ� �������� �̸�, ��ȭ��ȣ, �̸��� �־
		// displayInfo()�� ������ּ���.
		c2.setName("����");
		c2.setPhone("010-3433-6432");
		c2.setEmail("gs@gamail.com");
		c2.displayInfo();
		

	} // end main()

} // end AccessMain04
