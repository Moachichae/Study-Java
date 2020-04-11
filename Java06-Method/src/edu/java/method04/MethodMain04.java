package edu.java.method04;

import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		// 배열을 매개변수로 갖는 메소드
		
		// 점수(int) 5개를 저장할 수 있는 배열 선언
		int[] scores =new int[5];
		
		// 배열에 입력
		inputScores(scores); // scores는 주소값을 인자로 전달함
		
		// 배열값 출력
	    printScores(scores);
	    
	    // 배열에 저장된 점수들의 총합을 출력(메소드 사용)
	    int total = calcTotal(scores);
	    System.out.println("합계 = " + total);
	    
	    // 배열의 값 중에 최대 값을 출력(메소드 사용)
	    int max = findMax(scores);
	    System.out.println("최대값 = " + max);

	} //end main()
	// 배열의 값 중에 최대값을 찾는 메소드
	private static int findMax(int[] scores) {
		int max = scores[0];
		for (int i =1; i < scores.length;i++){
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	} // end findMax()

	// 배열에 있는 점수를 모두 더하는 메소드
	private static int calcTotal(int[] scores) {
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	} // end calcTotal()

	// 배열에 점수를 저장하는 메소드 생성
	private static void inputScores(int[] scores) { // 주소값을 전달받음
		Scanner sc = new Scanner(System.in);
		// 주소값이 동일하기 때문에 main에 있는 socres배열에 값을 저장하는 것과 같음
		for(int i = 0; i< scores.length; i++) {
			System.out.println("점수" + i + ">");
			scores[i] = sc.nextInt();
		}
		sc.close();
	} // end inputScores()
	
	// 배열에 있는 점수를 출력하는 메소드
	private static void printScores(int[] scores) {
		System.out.println("입력한 점수 : ");
		for(int x : scores) {
			System.out.println(x);
		}
	} // end printScores()

} // end MethodMain04
