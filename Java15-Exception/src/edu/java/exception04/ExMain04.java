package edu.java.exception04;

public class ExMain04 {

	public static void main(String[] args) {
		try {
			System.out.println("try ����");
			String name = null;
			System.out.println("���ڿ� ���� : " + name.length());
		} catch(NullPointerException e) {
			System.out.println("���� �޼��� : " + e.getMessage());
		}
		
		System.out.println("���α׷� ����");
	} // end main()

} // end ExMain04
