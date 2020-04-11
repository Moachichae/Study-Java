package edu.java.access05;

public class Point {
	private double x; // x ��ǥ
	private double y; // y ��ǥ
	
	// �⺻ ������
	public Point() {}
	// �Ű������� ���� ������
	public Point(double x,double y) {
		this.x = x;
		this.y = y;		
	}
	
	// getter/setter �޼ҵ�
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	} 
	
	// ���� ��ǥ�� �ٸ� ��ǥ ������ �Ÿ��� �����ϴ� �޼ҵ�
	public double distance(Point pt) {	
	return Math.sqrt((x- pt.x)*(x- pt.x) + (y - pt.y)*(y - pt.y));
	}
	
	

} // end Point
	