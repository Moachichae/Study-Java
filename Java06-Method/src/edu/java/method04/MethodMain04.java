package edu.java.method04;

import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		// �迭�� �Ű������� ���� �޼ҵ�
		
		// ����(int) 5���� ������ �� �ִ� �迭 ����
		int[] scores =new int[5];
		
		// �迭�� �Է�
		inputScores(scores); // scores�� �ּҰ��� ���ڷ� ������
		
		// �迭�� ���
	    printScores(scores);
	    
	    // �迭�� ����� �������� ������ ���(�޼ҵ� ���)
	    int total = calcTotal(scores);
	    System.out.println("�հ� = " + total);
	    
	    // �迭�� �� �߿� �ִ� ���� ���(�޼ҵ� ���)
	    int max = findMax(scores);
	    System.out.println("�ִ밪 = " + max);

	} //end main()
	// �迭�� �� �߿� �ִ밪�� ã�� �޼ҵ�
	private static int findMax(int[] scores) {
		int max = scores[0];
		for (int i =1; i < scores.length;i++){
			if(max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	} // end findMax()

	// �迭�� �ִ� ������ ��� ���ϴ� �޼ҵ�
	private static int calcTotal(int[] scores) {
		int total = 0;
		for(int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		return total;
	} // end calcTotal()

	// �迭�� ������ �����ϴ� �޼ҵ� ����
	private static void inputScores(int[] scores) { // �ּҰ��� ���޹���
		Scanner sc = new Scanner(System.in);
		// �ּҰ��� �����ϱ� ������ main�� �ִ� socres�迭�� ���� �����ϴ� �Ͱ� ����
		for(int i = 0; i< scores.length; i++) {
			System.out.println("����" + i + ">");
			scores[i] = sc.nextInt();
		}
		sc.close();
	} // end inputScores()
	
	// �迭�� �ִ� ������ ����ϴ� �޼ҵ�
	private static void printScores(int[] scores) {
		System.out.println("�Է��� ���� : ");
		for(int x : scores) {
			System.out.println(x);
		}
	} // end printScores()

} // end MethodMain04
