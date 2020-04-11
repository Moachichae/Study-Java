package edu.java.interfacehomework;

import java.util.Scanner;


public class ContactMain {
	
	private static Scanner sc;
	private static ContactDAO dao;

	public static void main(String[] args) {
		System.out.println("연락처 프로그램");
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
					System.out.println("다시 선택하세요");
			} // end switch
		} // end while
		
		sc.close();
		System.out.println("프로그램 종료!");
		

	} // end main()

	private static void showMainMenu() {
		 System.out.println();
		 System.out.println("---------------------------------");
		 System.out.println("0.종료 | 1.등록 | 2.전체검색 | 3. 인덱스검색 | 4.수정");
		 System.out.println("----------------------------------");
		 System.out.println("선택>");
		
	}

	private static void insertMember() {
		System.out.println();
		System.out.println("--- 연락처 정보 등록 ---");
		System.out.println("이름 입력>");
		String name = sc.nextLine();
		System.out.println("전화번호 입력>");
		String phone = sc.nextLine();
		System.out.println("이메일 입력>");
		String email = sc.nextLine();
		
		ContactVO vo = new ContactVO(name, phone, email);
		
		int result = dao.insert(vo);
		if (result == 1) {
			System.out.println("연락처 등록 성공");
		}else {
			System.out.println("연락처 등록 실패");
		}
	} // end insertMember()
	

	private static void selectAll() {
		ContactVO[] list = dao.select();
		
		int count = ((ContactDAOImple) dao).getCount();
		for (int i = 0; i < count; i++) {
			System.out.println("연락처정보[" + i + "]");
			System.out.println(list[i]); 
		}
			
	} // end selectAll

	private static void selectByindex() {
		System.out.println();
		System.out.println("검색할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		int count = ((ContactDAOImple) dao).getCount();
		if (index >= 0 && index < count) {
			ContactVO vo = dao.select(index);
			System.out.println(vo);					
		} else {
			System.out.println("존재하지 않는 연락처 인덱스입니다.");
		}			
	} // end selectByindex()

	private static void updateMember() {
		System.out.println();
		System.out.println("수정할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("수정할 전화번호 입력>");
		String phone = sc.nextLine();
		
		System.out.println("수정할 이메일 입력>");
		String email = sc.nextLine();
		
		ContactVO vo = new ContactVO();
		vo.setPhone(phone);
		vo.setEmail(email);
		
		
		int result = dao.update(index, vo);
		if ( result == 1) {
			System.out.println("연락처 정보 수정 성공");
		} else {
			System.out.println("연락처 정보 수정 실패");
		}
		
	} // end updateMember()

			
	

} // end ContactMain




















