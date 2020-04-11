package edu.java.inherit06;

public class HybridCar extends Car {
	//��� ����
	private int battery;
	
	// ������
	public HybridCar() {}
	public HybridCar(int fuel, int battery) {
		super(fuel);
		this.battery = battery;
	}
	
	//getter/setter
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	@Override
	public void display() {
		System.out.println("���̺긮�� �ڵ��� ���� : "  + getFuel());
		System.out.println("���̺긮�� �ڵ��� ���͸� : " + battery);
	}
	
} // end HybridCar