package edu.java.for01;

// for �ݺ���
// - �ݺ� ������ �ϱ� ���� Ű����
// - for(�ʱ��; ���ǽ�; ������) {
//        (����)
//   }
// - �ʱⰪ�� �������Ѽ� ���ǽ��� false�� �� ������ ������ �ݺ�
// - ���� ����
//    1) �ʱ��. 2) ���ǽ�. 3) ����. 4) ������

public class ForMain01 {

	public static void main(String[] args) {
		System.out.println("for �ݺ���");
		for (int x = 1; x <= 10; x++) {
			System.out.println("Java" + x);
		}
		
		System.out.println("====================");
		// 1, 2, 3, 4, .... 15�� ���
		for (int x = 1; x <= 15; x++) {
			System.out.println("Java" + x);
		}
		
		// 15, 14, 13, 12, ... 1�� ���
		for (int x = 15; x>=1 && x <= 15 ; x--) {
				System.out.println("Java" + x);
		}
		
		
		
	} // end main()

} // end ForMain01
