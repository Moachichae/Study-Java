package edu.java.homework;

public class HomeWork {

	public static void main(String[] args) {
		// 1. �ݺ��� ���, 'A'���� 'Z'���� ����ϴ� ���α׷�
		char A = 'A';
		while (A <= 'Z') {
			System.out.println(A);
			A++;
		}
		System.out.println();

		// 2. �ֻ����� ���� 5�� ��� ���ߴ� ���α׷�
		while (true) {
			int count = 1;
			double ar = Math.random();
			double br = Math.random();
			int a = (int) (ar * 6 + 1);
			int b = (int) (br * 6 + 1);

			int add = a + b;

			System.out.println(count + "��° - ");
			System.out.println("x : " + a + "," + "y : " + b);

			System.out.println("�ֻ��� �� : " + add);
			if (add == 5) {
				break;

			}

			count++;
		}

		System.out.println();

		// 3. �ﰢ�� ���
		// i = 1, j = 1
		// i = 2, j = 1, 2
		// i = 3, j = 1, 2, 3
		// i = 4, j = 1, 2, 3, 4
		// i = 5, j = 1, 2, 3, 4, 5
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("===============");

		// �ﰢ�� ��� 2
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i > j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		// 4. n�� sum ���
		int sum = 0;
		int n = 1;
		for (;;) {
			if (n % 2 == 1) { // n�� Ȧ��
				sum = sum + n;
			} else { // n�� ¦��
				sum = sum - n;
			}
			if (sum >= 100) {
				break;
			}

			n++;
		}
		System.out.println("sum =" + sum);
		System.out.println("n =" + n);

	} // end main()

} // end HomeWork
