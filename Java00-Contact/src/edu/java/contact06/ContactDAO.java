package edu.java.contact06;

import java.util.ArrayList;

public interface ContactDAO {
	// ����ó ���
	public abstract int insert(ContactVO vo);
	// ��ü �˻� ���
	public abstract ArrayList<ContactVO> select();
	// �ε��� �˻� ���
	public abstract ContactVO select(String nameSearch);
	// ����ó ���� - �̸�, ��ȭ��ȣ, �̸��� ����
	public abstract int update(String nameSearch, ContactVO vo);
	// ����ó ����
	public abstract int delete(String nameSearch);	
}


