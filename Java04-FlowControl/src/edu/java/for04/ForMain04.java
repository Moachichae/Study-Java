package edu.java.for04;

public class ForMain04 {

	public static void main(String[] args) {
		System.out.println("for�� ����3");
		
		// - For���� if���� Ȱ���Ͽ� �Ʒ� ��� ����� ��Ÿ���ÿ�.
		// 1���� 2���� 3���� �ε��
		// 4���� 5���� 6���� �ε��
		// 7���� 8���� 9���� �ε��
		// 10���� �ε�� ���� ~
		
		for (int i = 1; i <= 10; i++ ) {
			System.out.print(i+ "���� ");
		    if (i == 10) {
				System.out.println(" �ε�� ���� ~");
			}
		    else if (i % 3 == 0) {
				System.out.println(" �ε��");
			} 
			
		}
		

	} // end main()

} // end ForMain04
