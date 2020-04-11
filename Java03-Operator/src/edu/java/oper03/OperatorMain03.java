package edu.java.oper03;

// ���� ������
// - ������ ���� 1���� �Ǵ� ������ �� ����ϴ� ������
// - ������ ��(prefix)�� ��(postfix)�� ���
// - ++,--
public class OperatorMain03 {

	public static void main(String[] args) {
		System.out.println("���� ������(++,--)");
		
		int num = 100;
		num++;
		// num = num = 1;
		// num += 1;
		System.out.println("num = " + num);
		
		int num2 = 100;
		++num2;
		System.out.println("num2 = " + num2);
		
		int num3 = 100;
		int result = ++num3 + 5; // num3 = 101�� �ǰ�, +5�� ����
		System.out.println("num3 = " + num3);
		System.out.println("result = " + result);
		
		
		int num4 = 100;
		result = num4++ + 5; 
		// num4 +5 �� ����ǰ� ���� result�� ������ ��,
		// num4 = 101�� �����
		System.out.println("num4 = " + num4);
		System.out.println("result = " + result);
		
		// ���� �����ڴ� ���� �� �Ǵ� ���� �ڿ� ����� �� ����
		// ���� �����ڰ� �ܵ����� ���Ǵ� ���� �հ� �ڰ� ��� ������ ���
		//   x++; �� ++x;�� ������ ȿ��
		// ���� �����ڰ� �ٸ� �����ڿ� �Բ� ���Ǵ� ����
		// ���� �ٸ� �����ں��� ���� ����� �ǰ�
		// �ڴ� �ٸ� �����ں��� ���߿� ����� ��
		
		int x = 10;
		result = x++ +5+ ++x;
		System.out.println("x = " + x);
		System.out.println("result = " + result);
		
		// ��� ����
		// 1. x++ + 5
		//    (1) x + 5 ==> 10 + 5 ==> 15
		//    (2) x ���� ==> x = 11
		// 2. 15 + ++x
		//    (1) x ���� ==> x = 12
		//    (2) 15 + 12 ==> 27
		// 3. result = 27
		
		
	} // end main()

} // end OperatorMain03
