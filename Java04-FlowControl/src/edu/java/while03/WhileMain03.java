package edu.java.while03;

// do - while
// - ������ �ѹ� ������ ������ ��
// �ݺ����� ���ǿ� ���� �ݺ� ����
// - ���� ����
//    do { ���� }
//    while(����)
public class WhileMain03 {

	public static void main(String[] args) {
		System.out.println("do-while��");
		
		int count = 0;
		while (count > 0 ) {
			System.out.println(count);
			count--;		
		} // count ���� ��µ��� ����
		
		do {
			System.out.println(count);
			count--;
		} while (count>0);
		
		// while�� �ּ� ���� Ƚ�� : 0
		// do -while�� �ּ� ���� Ƚ�� : 1
		
		

	} // end main()

} // end WhileMain03
