package edu.java.interface01;

public interface DatabaseQuery {
	// �������̽��� ��� ���� : public static final
	public static final int DATA_VERSION = 1;
	public static final String DATABASE_VERSION = null;
	
	// �������̽��� �޼ҵ� : public abstract
	public abstract int insert(String id, String pw);
}













