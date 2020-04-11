package edu.java.interface05;

import java.util.Scanner;

public class InterfaceMain05 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) { // ���� ����
			System.out.println("-----------------------");
			System.out.println("0.���� | 1.�Է� | 2.�˻�");
			System.out.println("-----------------------");
			System.out.println("����>");
			
			int choice = sc.nextInt();
			switch (choice) {
			case Menu.MENU_QUIT :
				run = false;
				System.out.println(Menu.STR_QUIT);
				break;
			case Menu.MENU_INSERT :
				System.out.println(Menu.MENU_INSERT);
				break;
			case Menu.MENU_SELECT :
				System.out.println(Menu.MENU_SELECT);
				break;
			default : 
					System.out.println("�ٽ� �����ϼ���.");
			}			
		}
		sc.close();
	} // end main()

} // end InterfaceMain05
