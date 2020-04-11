package edu.java.class04;

public class Score {
	// ��� ����(�ʵ�, ������Ƽ)
	int kor; // ���� ����
	int eng; // ���� ����
	int math; // ���� ����
	
	// ������ overloading : �������� �̸��� ����, �Ű������� �ٸ�
	public Score() {}
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// �� ������ ������ �����ϴ� �޼ҵ�
	public int calcTotal() {
		return kor + eng + math;
	} // end calcTotal()
	
	// ����� �����ϴ� �޼ҵ�
	public double calcAverage() {
		return(double) calcTotal() / 3;
	} // end calcAverage()
	
} // end Score
