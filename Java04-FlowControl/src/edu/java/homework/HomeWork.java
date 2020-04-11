package edu.java.homework;

public class HomeWork {

	public static void main(String[] args) {
		// 1. 반복문 사용, 'A'부터 'Z'까지 출력하는 프로그램
		char A = 'A';
		while (A <= 'Z') {
			System.out.println(A);
			A++;
		}
		System.out.println();

		// 2. 주사위의 합이 5인 경우 멈추는 프로그램
		while (true) {
			int count = 1;
			double ar = Math.random();
			double br = Math.random();
			int a = (int) (ar * 6 + 1);
			int b = (int) (br * 6 + 1);

			int add = a + b;

			System.out.println(count + "번째 - ");
			System.out.println("x : " + a + "," + "y : " + b);

			System.out.println("주사위 합 : " + add);
			if (add == 5) {
				break;

			}

			count++;
		}

		System.out.println();

		// 3. 삼각형 출력
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

		// 삼각형 출력 2
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

		// 4. n과 sum 출력
		int sum = 0;
		int n = 1;
		for (;;) {
			if (n % 2 == 1) { // n이 홀수
				sum = sum + n;
			} else { // n이 짝수
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
