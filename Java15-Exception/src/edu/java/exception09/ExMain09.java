package edu.java.exception09;

import java.util.Scanner;

// ����� ���� ����(Exception) Ŭ������ ����� ���
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
			System.out.println("���� ���� : " + korean);
		} catch (ScoreInputException e) {
			// TODO Auto-generated catch block
			System.out.println("���� : " + e.getMessage());
		} 
		
				
			try {
				int age = inputAge();
				System.out.println("���� : " + age);
			} catch (AgeInputException e) {
				// TODO Auto-generated catch block
				System.out.println("���� : " + e.getMessage());
			}
	

	} // end main()

	private static int inputScore() throws ScoreInputException {
		System.out.println("���� �Է�>");
		int score = sc.nextInt();
		// 1. �Է� ���� ������ 0 ~ 100 ���̰� �ƴϸ�
		// ����(Exception)�� �����ؼ� ����(throws)
		if(score < 0 || score > 100) {
			ScoreInputException ex = 
					new ScoreInputException("���� �Է� ���� " + score);
			throw ex;
		}
		return score;
	}
	
	
	
	private static int inputAge() throws AgeInputException {
		System.out.println("���� �Է�>");
		int age = sc.nextInt();
		if(age < 0 || age > 130) {
			AgeInputException ex = 
					new AgeInputException("���� �Է� ���� " + age);
			throw ex;
		}
		return age;
	}

} // end ExMain09













