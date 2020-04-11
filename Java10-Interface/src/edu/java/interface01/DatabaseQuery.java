package edu.java.interface01;

public interface DatabaseQuery {
	// 인터페이스의 멤버 변수 : public static final
	public static final int DATA_VERSION = 1;
	public static final String DATABASE_VERSION = null;
	
	// 인터페이스의 메소드 : public abstract
	public abstract int insert(String id, String pw);
}













