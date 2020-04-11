package edu.java.contact02;

import java.util.Scanner;

public class ContactMain02 {
	public static Scanner sc = new Scanner(System.in);
	public static ContactDAO dao;

	public static void main(String[] args) {
		System.out.println("����ó Version 0.2");
		dao = ContactDAOImple.getInstance();
		

		int choice = 0;
		boolean run = true;
		while (run) { // ���ѷ���
			showMainMenu();
			choice = sc.nextInt();
			sc.nextLine(); // ���� �ڿ� ����Ű�� ����

			// ���õ� ��ȣ�� ���� �� ����� ����
			switch (choice) {
			case Menu.QUIT: // ����
				
				run = false;
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			case Menu.INSERT: // ���
				insertContact();
				break;
			case Menu.SELECT_ALL: // ��ü�˻�
				selectAllContact();
				break;
			case Menu.SELECT_BY_INDEX: // �� �˻�
				selectContact();
			case Menu.UPDATE: // ����
				updateContact();
				break;
			default:
				System.out.println("�߸��� ��ȣ �����Դϴ�. 0 ~ 4 ���� ������ �ּ���");
			}
		}

	} // end main()

	// �޴� UI �����ִ� �Լ�
	public static void showMainMenu() {
		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("1.��� | 2.��ü�˻� | 3.�󼼰˻� | 4.���� | 0.����");
		System.out.println("----------------------------------------");
		System.out.println("����>");
	} // end showMainMenu

	// ����ó ��� �Լ�
	public static void insertContact() {
		System.out.println(ContactMain02.class.getName() + " - insertContact()");
		System.out.println();
		System.out.println("����ó ��� �޴�");
		System.out.println("------------------------------------");
		System.out.println("�̸� �Է�>");
		String name = sc.nextLine();
		System.out.println("��ȭ��ȣ �Է�>");
		String phone = sc.nextLine();
		System.out.println("�̸��� �Է�>");
		String email = sc.nextLine();
		System.out.println("����ó �Է� �Ϸ�!");
		
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
		ContactVO[] list = dao.select();
		int count = ((ContactDAOImple) dao).getCount();
		for (int i = 0; i < count; i++) {
			System.out.println();
			System.out.println("--- ����ó" + i + "---");
			System.out.println(list[i]);
		}
	}

	// ����ó �󼼰˻� �Լ�
	public static void selectContact() {
		System.out.println();
		System.out.println("�˻��� �ε��� �Է�>");
		int index = sc.nextInt();
		sc.nextLine();

		int count = ((ContactDAOImple) dao).getCount();
		if (index >= 0 && index < count) {
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

		int count = ((ContactDAOImple) dao).getCount();
		if (index >= 0 && index < count) {
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

	} // end updateContact();

} // end ContactMain01
