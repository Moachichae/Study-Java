package edu.java.collection04;


public class Score{
	// ��� ���� - ����(eng), ����(math) ���� ����
	
	private int english;
	private int math;
	// �⺻ ������, �Ű����� ������ �ۼ�
	public Score() {};
	
	
	public Score(int english, int math) {		
		this.english = english;
		this.math = math;
	}
	// getter/setter �ۼ�
	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	@Override
	public String toString() {
		String str = "���� :" + english + "\n" +
				"���� : " + math;
		return str;
	}
	
	
	
}
