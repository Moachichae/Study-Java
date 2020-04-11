package edu.java.contact04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMain04 {	
	public static Scanner sc = new Scanner(System.in);
	public static ContactDAO dao;
	public static int size;
	
	public static void main(String[] args) {
		System.out.println("����ó Version 0.4");
		dao = ContactDAOImple.getInstance();
		
		int choice = 0;
		boolean run = true;
		while (run) { // ���� ����
			showMainMenu();
			choice = sc.nextInt();
			sc.nextLine(); // ���� �ڿ� ����Ű�� ����
			
			// ���õ� ��ȣ�� ���� �� ����� ����
			switch (choice) {
			case Menu.QUIT : 	// ���α׷� ����
				run = false;
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			case Menu.INSERT : // ���
				insertContact();
				break;
			case Menu.SELECT_ALL : // ��ü�˻�
				selectAllContact();
				break;
			case Menu.SELECT_BY_INDEX : // �󼼰˻�
				selectContact();
				break;
			case Menu.UPDATE : // ����
				updateContact();
				break;
			case Menu.DELETE : // ����
				deleteContact();
				break;
			default :
				System.out.println("�߸��� ��ȣ �����Դϴ�. 0 ~ 4���� ������ �ּ���.");
			}
		}
	} // end main()
	
	// �޴� UI �����ִ� �Լ�
	public static void showMainMenu() {
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("0.���� | 1.��� | 2.��ü�˻� | 3. �󼼰˻� | 4.���� | 5.����");
		System.out.println("-------------------------------------------------------");
		System.out.println("����>");
	} // end showMainMenu()
	
	// ����ó ��� �Լ�
	public static void insertContact() {
		System.out.println(ContactMain04.class.getName() + " - insertContact()");
		System.out.println();
		System.out.println("����ó ��� �޴�");
		System.out.println("------------------------------------------------");
		System.out.println("�̸� �Է�>");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ �Է�>");
		String phone = sc.nextLine();
		System.out.println("�̸��� �Է�>");
		String email = sc.nextLine();
		
		// Contact �ν��Ͻ� ����
		ContactVO vo = new ContactVO(name, phone, email);
		System.out.println("vo data - " + vo);
		int result = dao.insert(vo);
		if (result == 1) {
			System.out.println("����ó ��� ����");
		} else {
			System.out.println("����ó ��� ����");
		}
		
	} // end insertContact()
	
	// ����ó ��ü �˻� �Լ�
	public static void selectAllContact() {
		ArrayList<ContactVO> list = dao.select();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("--- ����ó " + i + " ---");
			System.out.println(list.get(i));
		}
	}
	
	// ����ó �󼼰˻� �Լ�
	public static void selectContact() {
		System.out.println();
		System.out.println("�˻��� �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		size = ((ContactDAOImple) dao).getSize();
		if (index >= 0 && index < size) {
			ContactVO vo = dao.select(index);
			System.out.println("����ó[" + index + "]");
			System.out.println(vo);
		} else {
			System.out.println("�ش� �ε����� ����ó�� �����ϴ�!");
		}
	} // end selectContact()

	// ����ó ���� �Լ�
	public static void updateContact() {
		System.out.println();
		System.out.println("������ �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		size = ((ContactDAOImple) dao).getSize();
		if (index >= 0 && index < size) {
			System.out.println("������ �̸� �Է�>");
			String name = sc.nextLine();
			System.out.println("������ ��ȭ��ȣ �Է�>");
			String phone = sc.nextLine();
			System.out.println("������ �̸��� �Է�>");
			String email = sc.nextLine();
			
			ContactVO vo = new ContactVO(name, phone, email);
			int result = dao.update(index, vo);
			if (result == 1) {
				System.out.println("����ó ���� �Ϸ�!");				
			} else {
				System.out.println("����ó ���� ����!");
			}
		} else {
			System.out.println("�ش� �ε����� ����ó�� �����ϴ�!");
		}
	} // end updateContact()
	
	private static void deleteContact() {
		System.out.println();
		System.out.println("������ �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();
		
		size = ((ContactDAOImple) dao).getSize();
		if (index >= 0 && index < size) {
			int result = dao.delete(index);
			if (result == 1) {
				System.out.println("���� ����");				
			} else {
				System.out.println("���� ����");
			}
		} else {
			System.out.println("���� �ε��� ��ȣ�Դϴ�.");
		}
	}
	
	
} // end ContactMain01

