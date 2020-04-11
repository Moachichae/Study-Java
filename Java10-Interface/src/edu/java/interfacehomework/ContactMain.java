package edu.java.interfacehomework;

import java.util.Scanner;


public class ContactMain {
	
	private static Scanner sc;
	private static ContactDAO dao;

	public static void main(String[] args) {
		System.out.println("����ó ���α׷�");
		sc = new Scanner(System.in);
		dao = ContactDAOImple.getinstance();
		
		boolean run = true;
		while(run) {
			showMainMenu();
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
			case Menu.QUIT :
				run = false;
				break;
			case Menu.INSERT :
				insertMember();
				break;
			case Menu.SELECT_ALL :
				selectAll();
				break;
			case Menu.SELECT_BY_INDEX :
				selectByindex();
				break;
			case Menu.UPDATE :
				updateMember();
				break;
				default : 
					System.out.println("�ٽ� �����ϼ���");
			} // end switch
		} // end while
		
		sc.close();
		System.out.println("���α׷� ����!");
		

	} // end main()

	private static void showMainMenu() {
		 System.out.println();
		 System.out.println("---------------------------------");
		 System.out.println("0.���� | 1.��� | 2.��ü�˻� | 3. �ε����˻� | 4.����");
		 System.out.println("----------------------------------");
		 System.out.println("����>");
		
	}

	private static void insertMember() {
		System.out.println();
		System.out.println("--- ����ó ���� ��� ---");
		System.out.println("�̸� �Է�>");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ �Է�>");
		String phone = sc.nextLine();
		System.out.println("�̸��� �Է�>");
		String email = sc.nextLine();
		
		ContactVO vo = new ContactVO(name, phone, email);
		
		int result = dao.insert(vo);
		if (result == 1) {
			System.out.println("����ó ��� ����");
		}else {
			System.out.println("����ó ��� ����");
		}
	} // end insertMember()
	

	private static void selectAll() {
		ContactVO[] list = dao.select();
		
		int count = ((ContactDAOImple) dao).getCount();
		for (int i = 0; i < count; i++) {
			System.out.println("����ó����[" + i + "]");
			System.out.println(list[i]); 
		}
			
	} // end selectAll

	private static void selectByindex() {
		System.out.println();
		System.out.println("�˻��� �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		int count = ((ContactDAOImple) dao).getCount();
		if (index >= 0 && index < count) {
			ContactVO vo = dao.select(index);
			System.out.println(vo);					
		} else {
			System.out.println("�������� �ʴ� ����ó �ε����Դϴ�.");
		}			
	} // end selectByindex()

	private static void updateMember() {
		System.out.println();
		System.out.println("������ �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("������ ��ȭ��ȣ �Է�>");
		String phone = sc.nextLine();
		
		System.out.println("������ �̸��� �Է�>");
		String email = sc.nextLine();
		
		ContactVO vo = new ContactVO();
		vo.setPhone(phone);
		vo.setEmail(email);
		
		
		int result = dao.update(index, vo);
		if ( result == 1) {
			System.out.println("����ó ���� ���� ����");
		} else {
			System.out.println("����ó ���� ���� ����");
		}
		
	} // end updateMember()

			
	

} // end ContactMain




















