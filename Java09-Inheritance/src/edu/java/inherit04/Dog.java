package edu.java.inherit04;

public class Dog extends Animal {
	// ��� ����
	private String type;
	
	// ������ overloading
	public Dog() {}
	public Dog(String name, String type) {
		super(name);
		this.type= type;
	}
	// �޼ҵ� ������(override)
	// - �θ� Ŭ������ ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������(�ٽ� ����)
	// - �޼ҵ��� ���� Ÿ��, �̸�, �Ű����� ��� ��ġ�ؾ� ��.
	@Override // annotation
	public void speak() {
		System.out.println("�۸�!!");
	}
	
	// �޼ҵ� �����ε�(overloading)
	// - �Ű������� �ٸ� �޼ҵ带 ���� �� �����ϴ� ��
	public void speak(String str) {
		System.out.println(str);
	} // end speak
	
} // end Dog















