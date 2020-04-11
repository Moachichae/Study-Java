package edu.java.access05;

public class Point {
	private double x; // x 좌표
	private double y; // y 좌표
	
	// 기본 생성자
	public Point() {}
	// 매개변수를 갖는 생성자
	public Point(double x,double y) {
		this.x = x;
		this.y = y;		
	}
	
	// getter/setter 메소드
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
	
	// 현재 좌표와 다른 좌표 사이의 거리를 리턴하는 메소드
	public double distance(Point pt) {	
	return Math.sqrt((x- pt.x)*(x- pt.x) + (y - pt.y)*(y - pt.y));
	}
	
	

} // end Point
	