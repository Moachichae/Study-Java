package edu.java.homework;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

import sun.security.util.Length;

public class HomeWork2 {

	public static void main(String[] args) {
		System.out.println("�迭 ����");

		
		int[] scores = new int[3];
		
		// for���� ����Ͽ�, �Է� ���� ������ �迭�� ����
		Scanner sc = new Scanner(System.in);
		// Crtl +Shift + O : �ڵ� import ����Ű
		for (int i = 0; i < scores.length; i++) {
			System.out.println("�Է�>");
			scores[i] = sc.nextInt();			
		}
		
		
		// for ���� ����Ͽ�, �Է¹��� ��� ���� ���
		for (int i = 0; i < scores.length; i++) {
			System.out.println("���� : ");
			scores[i] = sc.nextInt();			
		}
		
		sc.close();
		// �迭�� �ִ� ��� �������� �հ踦 ���
		
		
		
		// ������ ����� ����Ͽ� ���(�Ҽ������� ���)
		
		// ������ �ִ밪 ���
		int max = scores[0]; // �迭�� 0��° ���Ҹ� �ִ밪�̶�� ����
		for (int i = 1; i < scores.length; i++) {
			
		}


	}

}
