package edu.java.file06;

import java.io.Serializable;

// ��ü(Object) Ÿ���� ���Ͽ� ���ų�, ���Ͽ��� �о���� ���� ��
// Serializable �������̽��� �����ϴ� Ŭ������ �����ϸ� ��
// �����ؾ� �� �߻� �޼ҵ�� ���� ������
// implements Serializable �� �߰��� �ָ� ��


public class Member implements Serializable {
	private int no;
	private String id;
	private String pw;
	
	public Member(int no, String id, String pw) {
		this.no = no;
		this.id = id;
		this.pw = pw;
	}
	
	public void displayInfo() {
		System.out.println("-- ȸ�� ���� --");
		System.out.println("��ȣ : " + no);
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + pw);
	}
	
} // end Member

