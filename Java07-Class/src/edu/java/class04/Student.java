package edu.java.class04;

public class Student {
   // ��� ����(�ʵ�, ������Ƽ)
	int stuNo;	// �л� ��ȣ
	String name;// �л� �̸�
	Score score;// �л��� ����
	
	// �Ű� ������ �ִ� �����ڸ� �����
	// �⺻�����ڴ� �����ص� ��
	public Student (int stuNo, String name, Score score) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}
	
	// ��� �޼ҵ�
	public void displayStudentInfo() {
		System.out.println("--�л� ���� ---");
		System.out.println("��ȣ : " + stuNo);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + score.kor);
		System.out.println("���� : " + score.eng);
		System.out.println("���� : " + score.math);
		System.out.println("���� : " + score.calcTotal());
		System.out.println("��� : " + score.calcAverage());
	} // end displayStudentInfo()
	
} // end Student 

















