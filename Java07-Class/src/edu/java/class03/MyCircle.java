package edu.java.class03;

public class MyCircle {
	double radius;
	
	public  MyCircle() {}
	
	public MyCircle(double radius) {
		this.radius = radius; // this : �ڱ��ڽ�(MyCircle Ŭ����)
	}
	
	public double calcArea() {
		return radius*radius*Math.PI;
	}

} // end MyCircle
