package edu.java.class03;

public class MyCircle {
	double radius;
	
	public  MyCircle() {}
	
	public MyCircle(double radius) {
		this.radius = radius; // this : 자기자신(MyCircle 클래스)
	}
	
	public double calcArea() {
		return radius*radius*Math.PI;
	}

} // end MyCircle
