package edu.java.contact03;

import java.util.ArrayList;

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


	public ArrayList<ContactVO> list = new ArrayList<>();
	
	public int getSize() {
		return list.size();
	}

	@Override
	public int insert(ContactVO vo) {
		System.out.println(className + " - insert()");
		System.out.println("vo data - " + vo);
		list.add(vo);		
		return 1;
	}

	@Override
	public ArrayList<ContactVO> select() {
		return list;
	}

	@Override
	public ContactVO select(int index) {
		if (index >= 0 && index < list.size()) {
			return list.get(index);
		} else {
			return null;			
		}
	}

	@Override
	public int update(int index, ContactVO vo) {
		if (index >= 0 && index < list.size()) {
			list.set(index, vo);
			return 1;
		} else {
			return 0;			
		}
	}
	
	@Override
	public int delete(int index) {
		if (index >= 0 && index < list.size()) {
			list.remove(index);
			return 1;
		} else {
			return 0;			
		}
	}

} // end ContactDAOImple

















