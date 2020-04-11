package edu.java.access03;

//ĸ��ȭ (encapsulation)
// - Ŭ������ ������ ��, ��� ����(�ʵ�)���� private���� �����Ͽ�
//	�ܺ� Ŭ�������� �ʵ���� ���� �����ؼ� �аų� ���� ���ϰ� �ϴ� ��
// - �ʿ��� ��쿡 ���ؼ� public �޼ҵ带 �����Ͽ�
//	private ��� ������ �������� �аų� ���� ���� �����ϰ� �� �� ����

public class MyNumber {
	// ��� ����
	private int number;
	
	// ������
	public MyNumber(int number) {
		this.number = number;
	}
	
	// �޼ҵ�
	public void add(int x) {
		number += x;
	} // end add()
	
	// private ��� ������ ���������� �о���� �޼ҵ� - getter
	public int getNumber() {
		return number;
	}
	
	// private ��� ������ ���������� �����ϴ� �޼ҵ� - setter
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	
} // end MyNumber
