package edu.java.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// Score Ŭ������ �ν��Ͻ� ����
		Score score1 = new Score(10, 21, 30);
		System.out.println("���� :" +score1.kor);
		System.out.println("���� :" +score1.eng);
		System.out.println("���� :" +score1.calcTotal());
		System.out.println("��� :" +score1.calcAverage());
		System.out.printf("%.2f\n", score1.calcAverage());
		
		// Student Ŭ������ �ν��Ͻ� ����
		Student stu1 = new Student(1, "Mok", score1);
		stu1.displayStudentInfo();
		
		System.out.println();
		Score score2 = new Score(100, 100, 100);
		Student stu2 = new Student(2, "����", score2);
		System.out.println("���� : " + stu2.score.calcTotal());
				

	} // end main()

} // end ClassMain04
