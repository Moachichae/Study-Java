package edu.java.homework;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import sun.security.util.Length;

public class HomeWork2 {

	public static void main(String[] args) {
		System.out.println("배열 연습");

		
		int[] scores = new int[3];
		
		// for문을 사용하여, 입력 받은 점수를 배열에 저장
		Scanner sc = new Scanner(System.in);
		// Crtl +Shift + O : 자동 import 단축키
		for (int i = 0; i < scores.length; i++) {
			System.out.println("입력>");
			scores[i] = sc.nextInt();			
		}
		
		
		// for 문을 사용하여, 입력받은 모든 점수 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println("점수 : ");
			scores[i] = sc.nextInt();			
		}
		
		sc.close();
		// 배열에 있는 모든 점수들의 합계를 출력
		
		
		
		// 점수의 평균을 계산하여 출력(소수점까지 출력)
		
		// 점수의 최대값 출력
		int max = scores[0]; // 배열의 0번째 원소를 최대값이라고 가정
		for (int i = 1; i < scores.length; i++) {
			
		}


	}

}
