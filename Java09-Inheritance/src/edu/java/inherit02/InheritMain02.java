package edu.java.inherit02;

public class InheritMain02 {

	public static void main(String[] args) {
		// Person Ŭ������ �ν��Ͻ� ����
		Person p1 = new Person();
		System.out.println(p1);
		
		System.out.println("=================");
		// BusinessPerson Ŭ������ �ν��Ͻ� ����
		BusinessPerson p2 = new BusinessPerson();
		
		System.out.println("=================");
		BusinessPerson p3 = new BusinessPerson("������","����");
		
	} // end main()

} // end InheritMain02
