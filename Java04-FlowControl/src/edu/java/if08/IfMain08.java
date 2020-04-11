package edu.java.if08;

// SCE (Short-circuit evaluation : ª�� ���)
// Laz Evaluation (������ ���)
// A && B �� ����� �� A�� false�̸�, B�� ������� ����
// A || B �� ����� �� A�� true�̸�, B�� ������� ����
public class IfMain08 {

	public static void main(String[] args) {
		System.out.println("��� ��Ģ Ȯ��");
		
		int x = 0;
		int y = 0;
		
		if ((x += 10) < 0 && (y += 10) > 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		// x += 10 �� ���� ��� : x = 10
		// 10 < 0 �� ���� ��� : false
		// ���� ������ false �̹Ƿ� y += 10�� ������ ����
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		System.out.println("==================");
		x = 0;
		y = 0;
		
		if((x += 10) > 0 || (y += 10) > 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		// x += 10 �� ���� ��� : x = 10
		// 10 > 0 �� ���� ��� : true
		// ���� ���� ����� true�̹Ƿ� y += 10�� ������ ����
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

	} // end main()

} // end IfMain08
