package edu.java.string03;

class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {		
		return "(" + x + "," + y + ")";
	}
	
	@Override
	public boolean equals(Object obj) {	// Object : ��� Ŭ������ super Ŭ����
		boolean result = false; // ������ �� ����� ����
		
		if (obj instanceof Point) { // obj�� Point Ŭ������ �ν��Ͻ��� ��ȯ �����ϸ�
			Point pt = (Point) obj; // ���� �� ��ȯ
			if(x == pt.x && y == pt.y) { //  �� ���� ��ǥ�� ���ؼ� ������
				result = true;
			}
		}
		
		return result;
	}
	
} // end point

public class EqualsTest {

	public static void main(String[] args) {
		Point pt1 = new Point(1, 2);
		System.out.println(pt1);
		
		Point pt2 = new Point(1, 2);
		System.out.println(pt2);
		
		// �� ������(==) : ���� ������ �ּҰ��� ��
		if(pt1 == pt2) {
			System.out.println("���� ����");
		} else {
			System.out.println("�ٸ� ����");
		}
		
		// equals() �޼ҵ� : ��ü�� �� ��
		if ( pt1.equals(pt2)) {
			System.out.println("���� ��ǥ");
		} else {
			System.out.println("�ٸ� ��ǥ");
		}
	} // end main()

} // EqualsTest






















