package edu.java.for05;

public class ForMain05 {

	public static void main(String[] args) {
		System.out.println("for�� ����4");
		
		// ���������� �� ���ϱ� 
		// 1 + 2 + 3 + .... + 10
		
		int sum1 = 0;
		for (int i = 1; i<=10; i++) {
			sum1 = sum1 + i;
			System.out.println("i = " + i + ", sum1 = " + sum1);
		}
		int sum2 = 0;
		for (int i = 0; i<=100; i++) {
			if (i%2 == 0) {
				sum2 += i;
			System.out.println("i = " + i + ", sum2 = " + sum2);
			}
		}
		System.out.println(sum2);	
			
		// 1 ~ 100 ������ ¦������ ���� ���
		
		

	} // end main()

} // end ForMain05
