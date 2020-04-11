package edu.java.Variable12;

import java.util.Scanner;

public class VariableMain12 {

	public static void main(String[] args) {
		// Scanner 사용시 주의할 점
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("나이 입력 :");
		double age = sc.nextInt();
		System.out.println("age=" + age);
		
		sc.nextLine();
		// 나이를 입력하고 엔터를 치면
		// 엔터를 문자로 인식해서 뒤에 이름 입력이 실행되지 않음
		// 따라서 엔터를 제거해주는 코드가 필요함
		
		System.out.println("이름 입력 :");
		String name = sc.nextLine();
		System.out.println("name:" + name);
		
		sc.close();
		

	}

}
