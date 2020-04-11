package edu.java.interfacehomework;


public class ContactDAOImple implements ContactDAO {

	//--------------------------------------------------------//
	// Singleton 디자인 패턴 적용 시작
	
	
	private static ContactDAOImple instance = null;
	
	private ContactDAOImple() {}
	
	public static  ContactDAOImple getinstance() {
		if(instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}
	// Singleton 디자인 패턴 적용 끝
	//-------------------------------------------------------//	
	
	public static final int MAX = 100;
	private ContactVO[] list = new ContactVO[MAX];
	private int count;
	
	public int getCount() {
		return count;
	}
	
	
	
	@Override
	public int insert(ContactVO vo) {
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
		if(index >= 0 && index < count) {
			return list[index];
		}else {
			return null;
		}
	}

	@Override
	public int update(int index, ContactVO vo) {
		if(index >= 0 && index < count) {
			list[index].setPhone(vo.getPhone());
			list[index].setEmail(vo.getEmail());
			return 1;
		} else {
			return 0;
		}
	}

} // end ContactDAOImple
