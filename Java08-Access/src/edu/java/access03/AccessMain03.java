package edu.java.access03;

public class AccessMain03 {

	public static void main(String[] args) {
		// MyNumber Ŭ������ �ν��Ͻ� ����
		MyNumber num = new MyNumber(100);
		System.out.println("number = " + num.getNumber());
		num.add(1);
//		System.out.println(num.number);
		System.out.println("number = " + num.getNumber());
		
		// num.number ������ ���� 10���� ���� �� ���
		num.setNumber(10);
		System.out.println("number = " + num.getNumber());
	} // end main()

} // AccessMain03
