package edu.java.for03;

public class ForMain03 {

	public static void main(String[] args) {
		System.out.println("for�� ����2");
		
		// 1 ~ 100���� ���� �߿��� 9�� ����鸸 ���
		for (int x = 1; x <= 100; x++) {
			if ( x % 9 == 0) {
				System.out.println(x);
			}
		}
		
		// 1 ~ 100���� ���ڵ��� ���(10 ������ �ٹٲ�)
		// 1 2 3 ... 10
		// 11 12 13 .. 20
		// ....
		// 97 92 93 ... 100
		
		System.out.println("================");
		System.out.println(); // println() : �� �������� �ٹٲ�(\n)�� ���Ե� ��� �Լ�
		System.out.print(""); // print() : ���ڿ��� �����Ͽ� ���
		
		
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i%10 == 0) {
				System.out.println();
			}
		}
		
			

	} // end main()

} // end ForMain
