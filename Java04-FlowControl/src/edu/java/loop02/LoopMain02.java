package edu.java.loop02;

public class LoopMain02 {

	public static void main(String[] args) {
		System.out.println("���� �ֻ���");
		// �� ���� �ֻ����� ������ ���� ���� (x,y)�� ���� �������� ���
		// �� ���� �ֻ����� ���� ���ڰ� ������ ����
		
		int i = 1;
		while(true) {
			double rX = Math.random(); // 0 <= rX <1
			double rY = Math.random(); // 0 <= rY <1
			
			int x = (int)(6 * rX + 1);
			int y = (int)(6 * rY + 1);
			
			System.out.println(i + "��° -");
			System.out.println("x : " + x + "," + "y : " + y);
			
			if(x==y) {
				System.out.println("���� ���� ���Խ��ϴ�");
				break;
			}
			
			i++;
			
		}
		
		// for�� ���ѷ���
		for(;;) {
			
		}

	} // end main()

} // end LoopMain02
