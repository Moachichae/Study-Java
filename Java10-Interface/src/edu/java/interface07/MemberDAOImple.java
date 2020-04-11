package edu.java.interface07;

// DAO(Data Access Object) : MVC ���Ͽ��� Control Ŭ����
public class MemberDAOImple implements MemberDAO{

		
	// -----------------------------------------//
	// Singleton ������ ���� ���� ����
	
	// 1. private static �ڱ� �ڽ� Ÿ�� ��� ���� ����
	private static MemberDAOImple instance = null;
	
	// 2. private ������
	private MemberDAOImple() {}
	
	// 3. public static �޼ҵ� - �ν��Ͻ��� �����ϴ� �޼ҵ� ����
	public static MemberDAOImple getInstance() {
		if(instance == null) {
			instance = new MemberDAOImple();
		}
		return instance;
	}
	// Singleton ������ ���� ���� ��
	// -----------------------------------------//
	
	public static final int MAX = 100; // �ִ� ȸ����
	private MemberVO[] list = new MemberVO[MAX]; // ȸ�� ������ ������ �迭
	private int count; // �迭�� ����� ������ ����
	
	public int getCount() {
		return count;
	}

	@Override
	public int insert(MemberVO vo) {
		list[count] = vo;
		count++;
		return 1; // 0 : ����, 1 : ����
	}

	@Override
	public MemberVO[] select() {
		return list;
	}

	@Override
	public MemberVO select(int index) {
		if (index >= 0 && index < count) {
			return list[index];			
		} else {
			return null;
		}		
	}
	

	@Override
	public int update(int index, MemberVO vo) {
		if(index >= 0 && index < count) {
			list[index].setPw(vo.getPw());
			list[index].setEmail(vo.getEmail());
			return 1 ; // ����
		  } else {
			return 0; // ����
		}
	}
	
	
	
	

} // end MemberDAOImple








