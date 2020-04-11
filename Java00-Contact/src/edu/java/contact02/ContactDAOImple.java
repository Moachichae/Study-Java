package edu.java.contact02;

public class ContactDAOImple implements ContactDAO {
	// 클래스의 위치 및 이름 저장
	private static String className = ContactDAOImple.class.getName();
	
	// Singleton 패턴 적용
	// 1. private static 자기자신 타입 멤버 변수 선언
	private static ContactDAOImple instance = null;

	// 2. private 생성자
	private ContactDAOImple() {
	}

	// 3. public static 자기자신을 리턴하는 메소드
	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}

	// 연락처 최대 저장 개수 - 상수
	public static final int MAX = 100;

	public static ContactVO[] list = new ContactVO[MAX]; // 연락처 저장 배열
	private int count = 0; // 배열에 접근할 인덱스
	
	public int getCount() {
		return count;
	}

	@Override
	public int insert(ContactVO vo) {
		System.out.println(className + " - insert()");
		System.out.println("vo data -" + vo);
		list[count] = vo;
		count++;
		return 1;
	}

	@Override
	public ContactVO[] select() {		
		return list;
	}

	@Override
	public ContactVO select(int index) {
		if(index >= 0 && index < MAX) {
			return list[index];
		} else {
			return null;
		}	
	}

	@Override
	public int update(int index, ContactVO vo) {
		if(index >= 0 && index < count) {
//			list[index] = vo; // 배열에 vo 객체 저장
			list[index].setName(vo.getName());
			list[index].setPhone(vo.getPhone());
			list[index].setEmail(vo.getEmail());			
			return 1;
		}else {
			return 0;
		}
		
	}

} // end ContactDAOImple













