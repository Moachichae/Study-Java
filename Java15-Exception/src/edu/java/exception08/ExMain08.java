package edu.java.exception08;

import java.util.Scanner;

public class ExMain08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("�޴� ����>");
				int choice = Integer.parseInt(sc.nextLine());
				System.out.println("choice : " + choice);
				break;
			} catch (NumberFormatException e){
				System.out.println("���ڰ� �ƴմϴ�.");
			}
		}

	} // end main()

} // end ExMain08
