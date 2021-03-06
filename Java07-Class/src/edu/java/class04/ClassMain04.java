package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// Score 클래스의 인스턴스 생성
		Score score1 = new Score(10, 21, 30);
		System.out.println("국어 :" +score1.kor);
		System.out.println("영어 :" +score1.eng);
		System.out.println("총점 :" +score1.calcTotal());
		System.out.println("평균 :" +score1.calcAverage());
		System.out.printf("%.2f\n", score1.calcAverage());
		
		// Student 클래스의 인스턴스 생성
		Student stu1 = new Student(1, "Mok", score1);
		stu1.displayStudentInfo();
		
		System.out.println();
		Score score2 = new Score(100, 100, 100);
		Student stu2 = new Student(2, "진혁", score2);
		System.out.println("총점 : " + stu2.score.calcTotal());
				

	} // end main()

} // end ClassMain04
