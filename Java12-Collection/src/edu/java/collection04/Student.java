package edu.java.collection04;

public class Student {
	// ��� ���� - �̸�(name), ����(score)
	
	private String name;
	private Score score;
	// �⺻ ������, �Ű����� ������
	
	public Student() {}
	public Student(String name,Score score) {		
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Score getScore() {
		return score;
	}
	public void setScore(Score score) {
		this.score = score;
	}
	
	
	@Override
	public String toString() {
		String str = "�̸� : " + name+ "\n" +
					 "����  "+ "\n" + score;					
		return str;
	}
	
	
	
	
	
	
	
}
