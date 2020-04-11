package edu.java.collection04;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionMain04 {

	public static void main(String[] args) {
		
		// 수학/영어 점수 입력 받아서 Score 객체 생성
		Scanner sc = new Scanner(System.in);			
		
		
		
		List<Student> list = new LinkedList<Student>();
		for(int i = 0; i < 3; i++) {
			System.out.println("이름을 입력하세요");
			String name = sc.nextLine();
			System.out.println("영어점수를 입력하세요");
			int english = sc.nextInt();
			sc.nextLine();
			System.out.println("수학점수를 입력하세요");
			int math = sc.nextInt();
			sc.nextLine();	
			Score scores = new Score(english,math);	
			Student student = new Student(name, scores);
			
			list.add(student);
		}
		
		
		for(int i = 0; i < list.size(); i++) { // 연습
			System.out.println("--- 학생["+i + " ]정보---" + "\n" + list.get(i));
		}
		
		for(int i = 0; i < list.size(); i++) { // 선생님
			System.out.println("--- 학생["+i + " ]정보---");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("수학 : " + list.get(i).getScore().getMath());
			System.out.println("영어 : " + list.get(i).getScore().getEnglish());
		}
		
		sc.close();	
		
		
		// 수정 : set()
		Score score = new Score(100, 100);
		Student stu = new Student("둘리",score);
		list.set(2, stu);
		
		// 1번 인덱스 학생의 정보 변경
		list.get(1).setName("또치");
		list.get(1).getScore().setMath(99); // 수학 점수 변경
		list.get(1).getScore().setEnglish(88); // 영어점수변경
		
		
		System.out.println("--- 변경후 ---");
		for(int i = 0; i < list.size(); i++) { // 선생님
			System.out.println("--- 학생["+i + " ]정보---");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("수학 : " + list.get(i).getScore().getMath());
			System.out.println("영어 : " + list.get(i).getScore().getEnglish());
		}
		
		
		// 삭제 : remove()
		list.remove(1);
		System.out.println("--- 삭제후 ---");
		for(int i = 0; i < list.size(); i++) { // 선생님
			System.out.println("--- 학생["+i + " ]정보---");
			System.out.println("이름 : " + list.get(i).getName());
			System.out.println("수학 : " + list.get(i).getScore().getMath());
			System.out.println("영어 : " + list.get(i).getScore().getEnglish());
		}
		
		
		
		
		
		// 이름, Score 객체로 Students 객체를 3개 생성
		// LinkedList 생성하여 Student 정보를 저장(add)
		
		// LinkedList의 내용을 검색(get), 변경(set), 삭제(remove) 하기
		// 검색 예시)
		// --- 학생[0] 정보 ---
		// 이름 : Kim
		// 수학 : 100
		// 영어 : 100
		
		// 변경 및 삭제는 임의의 인덱스와 데이터로 변경
		

	} // end main()

	

} // end Collection04
