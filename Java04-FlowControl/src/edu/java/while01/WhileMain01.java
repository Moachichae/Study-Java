package edu.java.while01;

// while ��
// - for���� ���� �ݺ���
// - ���� ����
//    while(����){
//      (����)
//     }
public class WhileMain01 {

	public static void main(String[] args) {
		System.out.println("while �ݺ���");
		
		int x = 0;
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("===============");
		// while���� ����Ͽ� 10, 9, 8, ... , 2, 1���� ����ϱ�
		
		 x = 10;
		while ( x > 0 ) {
			System.out.println(x);
			x--;
		}

	} // end main()

} // end WhileMain01
