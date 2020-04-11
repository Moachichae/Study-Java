package edu.java.contact03;

import java.util.ArrayList;

public interface ContactDAO {
	// ����ó ���
	public abstract int insert(ContactVO vo);
	// ��ü �˻� ���
	public abstract ArrayList<ContactVO> select();
	// �ε��� �˻� ���
	public abstract ContactVO select(int index);
	// ����ó ���� - �̸�, ��ȭ��ȣ, �̸��� ����
	public abstract int update(int index, ContactVO vo);
	// ����ó ����
	public abstract int delete(int index);	
}


