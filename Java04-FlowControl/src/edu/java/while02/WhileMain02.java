package edu.java.while02;

public class WhileMain02 {

	public static void main(String[] args) {
		System.out.println("while ������ ����");
		
		// ������ 3���� while���� ����ؼ� ���
		int dan = 3;
		int i = 1;
		while (i<=9) {
			System.out.println(dan + "X" + i + "=" + (dan * i));
			i++;
		}
		
		// ���� �ʱ�ȭ
		dan = 2;
		i = 1;
		while(dan <= 9) {
			System.out.println(dan + "��");
			i = 1;
			while(i<=9) {
				System.out.println(dan + "X" + i + "=" + (dan*i));
				i++;
			}
			dan++;
		}
		
		
		// for������ ������ ����ϱ�
		// �� : 2 ~ 9
		// ���ϴ� �� : 1 ~ 9
		
		for( dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "��");			
			for( i = 1; i<=9; i++ ) {
				System.out.println(dan + "X" + i + "=" + (dan*i));
			}
				
		}

	} // end main()

} // end WhileMain02
