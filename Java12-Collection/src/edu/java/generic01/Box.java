package edu.java.generic01;

// Generic Ŭ����
// - Ŭ������ ��� ����, �޼ҵ� �Ǵ� �������� �Ű�����, �޼ҵ��� ���� Ÿ�� ����
//	 �������� �ʰ�, �Ϲ����� �����ϴ� Ŭ����
// - generic Ŭ������ ������ �� ���Ǵ� �Ϲ�ȭ ����(T)�� Ŭ���� Ÿ�Ը� ����
//	-> �ڹ��� �⺻ �ڷ���(int, boolean, double, ..)�� ����� �� ����
//	-> �⺻ �ڷ��� ��ſ� wrapper Ŭ������ �Ϲ�ȭ ������ ���

public class Box<T>{
	private T content;
	
	public Box(T content) {
		this.content = content;
	}
	
	public T pullOut() {
		return content;
	}
} // end Box<T>











