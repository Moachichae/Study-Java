package edu.java.interface01;

public class OracleDatabaseQuery implements DatabaseQuery {

	@Override
	public int insert(String id, String pw) {
		System.out.println("����Ŭ DB ����");
		System.out.println("SQL ���� �ۼ�/����");
		System.out.println("SQL ���� ��� ó��");
		return 1;
	} // end insert()

} // end OracleDatabaseQuery












