package edu.java.inherit01;

public class BasicTv {
	// ��� ����(�ʵ�, ������Ƽ)
	private boolean powerOn;
	private int channer;
	private int volume;
	
	// ������
	public BasicTv() {}
	
	// �޼ҵ�
	public void turnOnOff() {
		if(powerOn) {
			powerOn = false;
			System.out.println("TV Off");
		} else {
			powerOn = true;
			System.out.println("TV On");
		}
	}
} // end BasicTv
