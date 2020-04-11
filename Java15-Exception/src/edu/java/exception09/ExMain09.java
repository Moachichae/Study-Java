package edu.java.exception09;

import java.util.Scanner;

// 사용자 정의 예외(Exception) 클래스를 만드는 방법
class ScoreInputException extends Exception{
	public ScoreInputException(String msg) {
		super(msg);
	}
} // end ScoreInputException

class AgeInputException extends Exception{
	public AgeInputException(String msg) {
		super(msg);
	}
} // end AgeInputException

public class ExMain09 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {		
		try {
			int korean = inputScore();
			System.out.println("국어 점수 : " + korean);
		} catch (ScoreInputException e) {
			// TODO Auto-generated catch block
			System.out.println("예외 : " + e.getMessage());
		} 
		
				
			try {
				int age = inputAge();
				System.out.println("나이 : " + age);
			} catch (AgeInputException e) {
				// TODO Auto-generated catch block
				System.out.println("예외 : " + e.getMessage());
			}
	

	} // end main()

	private static int inputScore() throws ScoreInputException {
		System.out.println("점수 입력>");
		int score = sc.nextInt();
		// 1. 입력 받은 점수가 0 ~ 100 사이가 아니면
		// 예외(Exception)을 생성해서 던짐(throws)
		if(score < 0 || score > 100) {
			ScoreInputException ex = 
					new ScoreInputException("점수 입력 오류 " + score);
			throw ex;
		}
		return score;
	}
	
	
	
	private static int inputAge() throws AgeInputException {
		System.out.println("나이 입력>");
		int age = sc.nextInt();
		if(age < 0 || age > 130) {
			AgeInputException ex = 
					new AgeInputException("나이 입력 오류 " + age);
			throw ex;
		}
		return age;
	}

} // end ExMain09













