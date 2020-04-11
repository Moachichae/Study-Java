package edu.java.contact02;

public class ContactDAOImple implements ContactDAO {
	// Ŭ������ ��ġ �� �̸� ����
	private static String className = ContactDAOImple.class.getName();
	
	// Singleton ���� ����
	// 1. private static �ڱ��ڽ� Ÿ�� ��� ���� ����
	private static ContactDAOImple instance = null;

	// 2. private ������
	private ContactDAOImple() {
	}

	// 3. public static �ڱ��ڽ��� �����ϴ� �޼ҵ�
	public static ContactDAOImple getInstance() {
		if (instance == null) {
			instance = new ContactDAOImple();
		}
		return instance;
	}

	// ����ó �ִ� ���� ���� - ���
	public static final int MAX = 100;

	public static ContactVO[] list = new ContactVO[MAX]; // ����ó ���� �迭
	private int count = 0; // �迭�� ������ �ε���
	
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
//			list[index] = vo; // �迭�� vo ��ü ����
			list[index].setName(vo.getName());
			list[index].setPhone(vo.getPhone());
			list[index].setEmail(vo.getEmail());			
			return 1;
		}else {
			return 0;
		}
		
	}

} // end ContactDAOImple













