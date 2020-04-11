package edu.java.collection04;


public class Score{
	// 멤버 변수 - 영어(eng), 수학(math) 변수 생성
	
	private int english;
	private int math;
	// 기본 생성자, 매개변수 생성자 작성
	public Score() {};
	
	
	public Score(int english, int math) {		
		this.english = english;
		this.math = math;
	}
	// getter/setter 작성
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
		String str = "영어 :" + english + "\n" +
				"수학 : " + math;
		return str;
	}
	
	
	
}
