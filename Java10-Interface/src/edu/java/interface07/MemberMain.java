package edu.java.interface07;

import java.util.Scanner;

// MVC 디자인 패턴에서 View 클래스
public class MemberMain {
	// 멤버 변수
	private static Scanner sc;
	private static MemberDAO dao; // MemberDAOImple 인스턴스를 저장할 변수+
	
	public static void main(String[] args) {
		System.out.println("회원 관리 프로그램");
		sc = new Scanner(System.in);
		dao = MemberDAOImple.getInstance(); // 다형성. 인스턴스생성
		
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
				selectByIndex();
				break;
			case Menu.UPDATE :
				updateMember();
				break;
			default :
				System.out.println("다시 선택하세요.");
			} // end switch()
					
		} // end while()
		
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
		System.out.println("--- 회원 정보 등록 ---");
		System.out.println("아이디 입력>");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력>");
		String pw = sc.nextLine();
		System.out.println("이메일 입력>");
		String email = sc.nextLine();
		
		// 입력받은 데이터로 MembeVO 클래스의 인스턴스 생성
		MemberVO vo = new MemberVO(id, pw, email);
		
		int result = dao.insert(vo);
		if (result == 1) {
			System.out.println("회원 등록 성공");
		}else {
			System.out.println("회원 등록 실패");
		}
		
	} // end insertMember()

	private static void selectAll() {
		// DAO의 select() 메소드 호출 -> 배열을 리턴 받음
		MemberVO[] list = dao.select();
		
		int count = ((MemberDAOImple) dao).getCount();
		for (int i = 0; i < count; i++) {
			System.out.println("회원정보[" + i + "]");
			System.out.println(list[i]);
		}
		
		
	} // end selectAll()

	private static void selectByIndex() {
		System.out.println();
		System.out.println("검색할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		int count = ((MemberDAOImple) dao).getCount();
		if (index >= 0 && index < count) {
			MemberVO vo = dao.select(index);
			System.out.println(vo);					
		} else {
			System.out.println("존재하지 않는 아이디 인덱스입니다.");
		}		
	} // end selectByIndex()

	private static void updateMember() {
		System.out.println();
		System.out.println("수정할 인덱스 입력>");
		int index = sc.nextInt();
		sc.nextLine();
		
		System.out.println("수정할 비밀번호 입력>");
		String pw = sc.nextLine();
		
		System.out.println("수정할 이메일 입력>");
		String email = sc.nextLine();
		
		MemberVO vo = new MemberVO();
		vo.setPw(pw);
		vo.setEmail(email);
		
		
		int result = dao.update(index, vo);
		if ( result == 1) {
			System.out.println("회원 정보 수정 성공");
		} else {
			System.out.println("회원 정보 수정 실패");
		}
		
		
		
	} // end updateMember()

} // end MemberMain













