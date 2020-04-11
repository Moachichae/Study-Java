package edu.java.inherit05;

public class Person {
	private String name;


	public Person(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	// �ڹ��� ��� Ŭ������ java.lang.Object Ŭ������ ��ӹ޾Ƽ� �������!
	// �ڹ��� ��� Ŭ������ Object Ŭ������ public �޼ҵ���� ��ӹ޾Ƽ� ��� ����
	// object Ŭ������ toString() �޼ҵ� :
	// - ��Ű���̸�.Ŭ�����̸�@������(�ּҰ�) ����
	@Override
	public String toString() {		
		return name + "�Դϴ�.";
	}
	
	
} // end Person
