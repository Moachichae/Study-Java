package edu.java.collection04;

public class Student {
	// 멤버 변수 - 이름(name), 점수(score)
	
	private String name;
	private Score score;
	// 기본 생성자, 매개변수 생성자
	
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
		String str = "이름 : " + name+ "\n" +
					 "점수  "+ "\n" + score;					
		return str;
	}
	
	
	
	
	
	
	
}
