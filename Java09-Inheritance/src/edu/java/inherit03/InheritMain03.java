package edu.java.inherit03;

public class InheritMain03 {

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone();
		System.out.println(phone1);
		
		SmartPhone phone2 = new SmartPhone("010-1111-2222");
		System.out.println(phone2);
		
		SmartPhone phone3 = new SmartPhone("010-111", "111.222.333.444");
		System.out.println(phone3);
		
	}

}
