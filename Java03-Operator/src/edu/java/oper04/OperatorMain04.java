package edu.java.oper04;


// �� ������
// - �� ���� ���������� ���� �� ���
// - ���� ����� true, false�� ����
// - <, >, <=, >=, ==, !=

// �� ������
// - boolean Ÿ���� ������ ����Ͽ� ����
// - A && B : AND(����) ����
//    A�� B�� ��� true �� ����  true, �������� false
// - A || B : OR(����) ����
//    A �Ǵ�  B�� true�̸�  true�̰�, A, B ��� false �� ���� false
// - !A : NOT(�� ����) ����
//     A�� true�̸� false, A�� false�̸� true

public class OperatorMain04 {

	public static void main(String[] args) {
		System.out.println("�� ������");
		
		System.out.println(10 > 20); // 10�� 20���� ū��?
		System.out.println(10 < 20); // 10�� 20���� ������?
		System.out.println(123 == 100); // 123�� 100�� ������?
		System.out.println(123 != 100); // 123�� 100�� �ٸ���?
		
		System.out.println("�� ������");
		boolean A = true;
		boolean B = false;
		System.out.println(A && B);
		System.out.println(A || B);
		System.out.println(!B);
		
		System.out.println((10 > 0) && (10 < 100));
		System.out.println((10 > 0) || (10 < 100));  
		System.out.println((10 <= 0) || (10 <= 100));
		System.out.println(!(111 < 100));
		
		



	} // end main()

} // end OperatorMain04










