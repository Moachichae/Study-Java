package edu.java.contact02;

public interface ContactDAO {
	// ����ó ���
	public abstract int insert(ContactVO vo);
	// ��ü �˻� ���
	public abstract ContactVO[] select();
	// �ε��� �˻� ���
	public abstract ContactVO select(int index);
	// ����ó ���� - �̸�, ��ȭ��ȣ, �̸��� ����
	public abstract int update(int index, ContactVO vo);
	
}
