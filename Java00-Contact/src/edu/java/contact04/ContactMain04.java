package edu.java.contact04;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactMain04 {	
	public static Scanner sc = new Scanner(System.in);
	public static ContactDAO dao;
	public static int size;
	
	public static void main(String[] args) {
		System.out.println("연락처 Version 0.4");
		dao = ContactDAOImple.getInstance();
		
		int choice = 0;
		boolean run = true;
		while (run) { // 무한 루프
			showMainMenu();
			choice = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 엔터키를 제거
			
			// 선택된 번호에 따라 각 기능을 수행
			switch (choice) {
			case Menu.QUIT : 	// 프로그램 종료
				run = false;
				System.out.println("프로그램이 종료되었습니다.");
				break;
			case Menu.INSERT : // 등록
				insertContact();
				break;
			case Menu.SELECT_ALL : // 전체검색
				selectAllContact();
				break;
			case Menu.SELECT_BY_INDEX : // 상세검색
				selectContact();
				break;
			case Menu.UPDATE : // 수정
				updateContact();
				break;
			case Menu.DELETE : // 삭제
				deleteContact();
				break;
			default :
				System.out.println("잘못된 번호 선택입니다. 0 ~ 4까지 선택해 주세요.");
			}
		}
	} // end main()
	
	// 메뉴 UI 보여주는 함수
	public static void showMainMenu() {
		System.out.println();
		System.out.println("-------------------------------------------------------");
		System.out.println("0.종료 | 1.등록 | 2.전체검색 | 3. 상세검색 | 4.수정 | 5.삭제");
		System.out.println("-------------------------------------------------------");
		System.out.println("선택>");
	} // end showMainMenu()
	
	// 연락처 등록 함수
	public static void insertContact() {
		System.out.println(ContactMain04.class.getName() + " - insertContact()");
		System.out.println();
		System.out.println("연락처 등록 메뉴");
		System.out.println("------------------------------------------------");
		System.out.println("이름 입력>");
		String name = sc.nextLine();
		System.out.println("전화번호 입력>");
		String phone = sc.nextLine();
		System.out.println("이메일 입력>");
		String email = sc.nextLine();
		
		// Contact 인스턴스 생성
		ContactVO vo = new ContactVO(name, phone, email);
		System.out.println("vo data - " + vo);
		int result = dao.insert(vo);
		if (result == 1) {
			System.out.println("연락처 등록 성공");
		} else {
			System.out.println("연락처 등록 실패");
		}
		
	} // end insertContact()
	
	// 연락처 전체 검색 함수
	public static void selectAllContact() {
		ArrayList<ContactVO> list = dao.select();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
			System.out.println("--- 연락처 " + i + " ---");
			System.out.println(list.get(i));
		}
	}
	
	// 연락처 상세검색 함수
	public static void selectContact() {
		System.out.println();
		System.out.println("검색할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		size = ((ContactDAOImple) dao).getSize();
		if (index >= 0 && index < size) {
			ContactVO vo = dao.select(index);
			System.out.println("연락처[" + index + "]");
			System.out.println(vo);
		} else {
			System.out.println("해당 인덱스에 연락처가 없습니다!");
		}
	} // end selectContact()

	// 연락처 수정 함수
	public static void updateContact() {
		System.out.println();
		System.out.println("수정할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		size = ((ContactDAOImple) dao).getSize();
		if (index >= 0 && index < size) {
			System.out.println("수정할 이름 입력>");
			String name = sc.nextLine();
			System.out.println("수정할 전화번호 입력>");
			String phone = sc.nextLine();
			System.out.println("수정할 이메일 입력>");
			String email = sc.nextLine();
			
			ContactVO vo = new ContactVO(name, phone, email);
			int result = dao.update(index, vo);
			if (result == 1) {
				System.out.println("연락처 수정 완료!");				
			} else {
				System.out.println("연락처 수정 실패!");
			}
		} else {
			System.out.println("해당 인덱스에 연락처가 없습니다!");
		}
	} // end updateContact()
	
	private static void deleteContact() {
		System.out.println();
		System.out.println("삭제할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		size = ((ContactDAOImple) dao).getSize();
		if (index >= 0 && index < size) {
			int result = dao.delete(index);
			if (result == 1) {
				System.out.println("삭제 성공");				
			} else {
				System.out.println("삭제 실패");
			}
		} else {
			System.out.println("없는 인덱스 번호입니다.");
		}
	}
	
	
} // end ContactMain01

