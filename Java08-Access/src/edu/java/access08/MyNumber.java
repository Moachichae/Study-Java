package edu.java.access08;

public class MyNumber {
	// ��� ����
	private int data;
	
	// ������
	public MyNumber() {}
	public MyNumber(int data) {
		this.data = data;
	}
	
	// getter/setter
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	// public���� �Լ� ����
	// ����Ÿ�� : MyNumber
	// �Լ��̸� : add
	// �Ű����� : MyNumber number
	// ��� : ���� ��ü�� data�� �Ű������� �ִ� data�� ���� ��
	// MyNumber ��ü�� �����ϴ� �޼ҵ�
	public MyNumber add(MyNumber number) {
		this.data = this.data + number.data;
		return this;
	}
	
} // end MyNumber












